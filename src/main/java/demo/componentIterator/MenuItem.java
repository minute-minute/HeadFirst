package demo.componentIterator;

import demo.iterator.Iterator;

/**
 * 菜单项
 */
public class MenuItem extends MenuComponent{
    String name;
    double price;
    /**蔬菜类食品标志*/
    boolean vegetarian;

    public boolean isVegetarian() {
        return vegetarian;
    }

    public MenuItem(String name, double price, boolean vegetarian) {
        this.name = name;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        return new NullIterator();
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
}

