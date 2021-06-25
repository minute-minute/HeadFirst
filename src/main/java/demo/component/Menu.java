package demo.component;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合菜单(Composite)
 */
public class Menu extends MenuComponent{
    List<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String description;

    public Menu() {}

    public Menu(String name,String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent component) {
        menuComponents.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        menuComponents.remove(component);
    }

    @Override
    public MenuComponent get(int i) {
        return menuComponents.get(i);
    }

    @Override
    public void print() {
        System.out.println("菜单名称："+getName()+"("+getDescription()+")");
        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return description;
    }
}
