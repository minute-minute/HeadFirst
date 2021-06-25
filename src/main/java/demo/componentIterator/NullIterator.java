package demo.componentIterator;

import demo.iterator.Iterator;

/**
 * 空迭代器
 */
public class NullIterator implements Iterator<MenuComponent> {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuComponent next() {
        return null;
    }

}
