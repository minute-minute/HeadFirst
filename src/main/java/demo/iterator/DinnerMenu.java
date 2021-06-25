package demo.iterator;

/**
 * 午餐菜单
 */
public class DinnerMenu {
    MenuItem[] menuItems = new MenuItem[20];
    int numberOfItems = 0;

    public DinnerMenu() {
        initItems();
    }

    public void addItem(String name,double price){
        MenuItem menuItem = new MenuItem(name, price);
        if(numberOfItems >= menuItems.length){
            System.out.println("菜单已满，不能再添加！");
            return ;
        }
        menuItems[numberOfItems] = menuItem;
        numberOfItems++;
    }
    /**
     *  创建自己的迭代器
     */
    public Iterator<MenuItem> createIterator() {
        return new DinnerMenuIterator(menuItems);
    }

    public void initItems(){
        addItem("青椒肉丝炒饭", 12);
        addItem("番茄鸡蛋炒饭", 10);
        addItem("鱼香茄子炒饭", 11);
        addItem("土豆烧鸡炒饭", 12.5);
    }
}
