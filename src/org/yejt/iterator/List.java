package org.yejt.iterator;

/**
 * Created by Yejt on 2017/8/17 0017.
 */
public interface List<T>
{
    public void add(T value);

    public boolean remove(T value);
    public void remove(int index);

    public T get(int index);

    public void set(T value, int index);

    public int size();

    public boolean isEmpty();

    public Iterator<T> getIterator();

}
