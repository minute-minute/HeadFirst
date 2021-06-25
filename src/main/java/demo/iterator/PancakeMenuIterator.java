package demo.iterator;

import java.util.ArrayList;

/**
 * 煎饼菜单迭代器
 */
public class PancakeMenuIterator implements Iterator<MenuItem>{
    ArrayList<MenuItem> menuItems;
    int position = 0;

    public PancakeMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuItems.size() || menuItems.get(position) == null)
            return false;
        return true;
    }

    @Override
    public MenuItem next() {
        MenuItem item = menuItems.get(position);
        position += 1;
        return item;
    }

}
