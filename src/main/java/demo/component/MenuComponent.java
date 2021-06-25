package demo.component;


/**
 * Component抽象类
 */
public abstract class MenuComponent {
    //=======菜单（组合节点）的方法=======
    /**
     * 增加菜单项
     */
    public void add(MenuComponent component) {
        throw new UnsupportedOperationException();
    }
    /**
     * 删除指定菜单项
     */
    public void remove(MenuComponent component) {
        throw new UnsupportedOperationException();
    }
    /**
     * 获取指定下标的菜单项
     */
    public MenuComponent get(int i) {
        throw new UnsupportedOperationException();
    }

    //=======菜单项（叶子节点）的方法=======
    /**
     * 获取菜单项的名称
     */
    public String getName() {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取菜单项的价格
     */
    public double getPrice() {
        throw new UnsupportedOperationException();
    }
    /**
     * 打印出菜单中的所有菜单项的信息，或者单个菜单项的信息
     * 菜单和菜单项都要用到的方法
     */
    public void print(){

    }
}
