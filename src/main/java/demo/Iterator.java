package demo;

public interface Iterator {
    /**
     * 迭代方法：获取并移动到第一个元素
     */
    Object first();
    /**
     * 迭代方法：移动到下一个元素,并返回当前元素
     */
    Object next();
    /**
     * 迭代方法：是否为最后一个元素
     */
    boolean hasNext();

}
