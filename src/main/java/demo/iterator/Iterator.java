package demo.iterator;

/**
 * 迭代器接口
 */
public interface Iterator<E> {

    boolean hasNext();

    E next();
}