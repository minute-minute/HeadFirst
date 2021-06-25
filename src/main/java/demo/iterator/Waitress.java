package demo.iterator;

/**
 * 服务员
 */
public class Waitress {
    PancakeMenu pancakeMenu = new PancakeMenu();
    DinnerMenu dinnerMenu = new DinnerMenu();

    /**
     * 打印出菜单
     */
    public void printMenu() {
        Iterator<MenuItem> iterator = pancakeMenu.createIterator();
        printMenu(iterator);
        iterator = dinnerMenu.createIterator();
        printMenu(iterator);
    }

    private void printMenu(Iterator<MenuItem> iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.getName()+":"+menuItem.getPrice());
        }
    }
}

