package demo.iterator;

/**
 * 饭店菜单迭代器
 */
public class DinnerMenuIterator implements Iterator<MenuItem>{
    MenuItem[] menuItems;
    int position = 0;

    public DinnerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuItems.length || menuItems[position] == null)
            return false;
        return true;
    }

    @Override
    public MenuItem next() {
        MenuItem item = menuItems[position];
        position += 1;
        return item;
    }

}
