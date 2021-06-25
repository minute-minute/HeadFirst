package demo.componentIterator;

import demo.iterator.Iterator;

public abstract class MenuComponent extends demo.component.MenuComponent {
    /**
     * 判断是否为蔬菜类食品
     */
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    /**
     * 创建迭代器
     * @return
     */
    public abstract Iterator<MenuComponent> createIterator();
}