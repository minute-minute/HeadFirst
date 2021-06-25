package demo.componentIterator;

import demo.iterator.Iterator;

import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {
    /**迭代器栈，存储最近一次迭代的菜单的迭代器*/
    Stack<Iterator<MenuComponent>> stack = new Stack<>();

    public CompositeIterator() {}

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        //初始化时中将组合菜单的总迭代器（即List<MenuComponent>的迭代器）放入栈
        stack.push(iterator);
    }
    @Override
    public boolean hasNext() {
        if(stack.isEmpty())
            return false;
        //返回栈顶的迭代器
        Iterator<MenuComponent> iterator = stack.peek();
        //如果该迭代器仍有元素可迭代，返回true
        if(iterator.hasNext()){
            return true;
        }
        //如果迭代器元素都已迭代完，弹出栈，递归判断栈中下一个迭代器
        else {
            stack.pop();
            return hasNext();
        }
    }

    @Override
    public MenuComponent next() {
        //如果没有元素可迭代，直接返回null
        if(!hasNext())
            return null;
        //有元素可迭代时，返回栈顶迭代器
        Iterator<MenuComponent> iterator = stack.peek();
        //取出迭代器中的下一个元素
        MenuComponent component = iterator.next();
        //如果该元素为菜单，将子菜单的迭代器放入栈中。这样下一次执行next()方法，则迭代该子菜单了
        if(component instanceof Menu){
            stack.push(component.createIterator());
        }

        return component;
    }
}

