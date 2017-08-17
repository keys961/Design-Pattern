package org.yejt.iterator;

/**
 * Created by Yejt on 2017/8/17 0017.
 */
public interface Iterator<T>
{
    public T getCurrentValue();

    public void setCurrentValue(T value);

    public void moveToFirst();

    public void moveToNext();

    public boolean isLast();

    public boolean hasNext();
}
