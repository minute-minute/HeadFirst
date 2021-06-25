package demo;

public interface Aggregate {
    /**
     * 创建相应迭代子对象的接口
     */
    Iterator createIterator();
}