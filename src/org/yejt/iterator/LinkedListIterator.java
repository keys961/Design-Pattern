package org.yejt.iterator;

/**
 * Created by Yejt on 2017/8/17 0017.
 */
public class LinkedListIterator<T> implements Iterator<T>
{
    private LinkedList<T> list;

    private LinkedList<T>.ListNode<T> currentNode;

    public LinkedListIterator(LinkedList<T> linkedList)
    {
        this.list = linkedList;
        currentNode = list.getHeadNode();
    }


    @Override
    public T getCurrentValue()
    {
        return currentNode.val;
    }

    @Override
    public void setCurrentValue(T value)
    {
        currentNode.val = value;
    }

    @Override
    public void moveToFirst()
    {
        currentNode = list.getHeadNode();
    }

    @Override
    public void moveToNext()
    {
        if(hasNext())
            currentNode = currentNode.next;
        else
            throw new NullPointerException("Access over the tail!");
    }

    @Override
    public boolean isLast()
    {
        return currentNode == list.getTailNode();
    }

    public boolean hasNext()
    {
        return currentNode.next != null;
    }
}
