package demo.component;

/**
 * 菜单项(Leaf)
 */
public class MenuItem extends MenuComponent{
    String name;
    double price;

    public MenuItem() {}

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println(name+":"+price);
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setPrice(double price) {
        this.price = price;
    }
}
