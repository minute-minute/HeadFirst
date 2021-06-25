package demo.componentIterator;

import demo.iterator.Iterator;

public class Waitress{
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    /**
     * 打印蔬菜食品
     */
    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = allMenus.createIterator();

        while (iterator.hasNext()) {
            MenuComponent component = iterator.next();
            try{
                if(component.isVegetarian())
                    System.out.println(component.getName());
            }
            //如果为菜单调用isVegetarian方法，会直接抛出异常，这里会直接不处理
            catch (UnsupportedOperationException e) {}
        }
    }

    public static void main(String[] args) {
        //建造烧饼菜单
        MenuComponent pancakeMenu = new Menu("早餐", "原烧饼店菜单");
        pancakeMenu.add(new MenuItem("葱花饼", 3.5, true));
        //建造正餐菜单子菜单-甜点菜单
        MenuComponent dessertMenu = new Menu("甜点", "正餐子菜单");
        dessertMenu.add(new MenuItem("芒果牛奶冰", 8, false));
        //建造正餐菜单
        MenuComponent dinnerMenu = new Menu("正餐", "原饭店菜单");
        dinnerMenu.add(new MenuItem("青椒肉丝炒饭", 12, false));
        dinnerMenu.add(dessertMenu);
        //建造主菜单
        MenuComponent totalMenu = new Menu("菜单", "总菜单");
        totalMenu.add(pancakeMenu);
        totalMenu.add(dinnerMenu);
        //服务员打印菜单
        Waitress waitress = new Waitress(totalMenu);
        //waitress.printMenu();
        waitress.printVegetarianMenu();
    }

}
