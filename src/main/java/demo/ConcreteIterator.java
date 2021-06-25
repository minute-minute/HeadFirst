package demo;

public class ConcreteIterator implements Iterator {
    //持有被迭代的具体的聚合对象
    private ConcreteAggregate agg;
    //内部索引，记录当前迭代到的索引位置
    private int index = 0;
    //记录当前聚集对象的大小
    private int size = 0;

    public ConcreteIterator(ConcreteAggregate agg){
        this.agg = agg;
        this.size = agg.size();
        index = 0;
    }
    /**
     * 迭代方法：获取并移动到第一个元素
     */
    @Override
    public Object first() {
        index = 0;
        Object obj = this.agg.get(index);
        return obj;
    }

    /**
     * 迭代方法：是否为最后一个元素
     */
    @Override
    public boolean hasNext() {
        if (index < size - 1) {
            return true;
        } else {
            return false;
        }
    }
    /**
     * 迭代方法：移动到下一个元素,并返回当前元素
     */
    @Override
    public Object next() {
        Object obj = null;
        if (this.hasNext()) {
            obj = this.agg.get(++index);
        }
        return obj;
    }

}