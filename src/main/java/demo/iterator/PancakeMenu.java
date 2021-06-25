package demo.iterator;

import java.util.ArrayList;

/**
 * 煎饼菜单
 */
public class PancakeMenu {
    ArrayList<MenuItem> menuItems = new ArrayList<>();

    public void addItem(String name,double price){
        MenuItem menuItem = new MenuItem(name, price);
        menuItems.add(menuItem);
    }

    public PancakeMenu() {
        initItems();
    }

    /**
     *  创建自己的迭代器
     */
    public Iterator<MenuItem> createIterator() {
        return new PancakeMenuIterator(menuItems);
    }

    public void initItems(){
        addItem("葱花饼", 3.5);
        addItem("牛肉饼", 6);
        addItem("猪肉饼", 5);
        addItem("韭菜饼", 2.5);
    }
}
