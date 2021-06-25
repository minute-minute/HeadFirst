package demo.componentIterator;

import demo.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合菜单
 */
public class Menu extends MenuComponent{
    List<demo.component.MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String description;

    public Menu(String name,String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(demo.component.MenuComponent component) {
        menuComponents.add(component);
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        return new CompositeIterator((Iterator<MenuComponent>) menuComponents.iterator());
    }
}

