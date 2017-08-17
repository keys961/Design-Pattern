package org.yejt.iterator;

/**
 * Created by Yejt on 2017/8/17 0017.
 */
public class LinkedList<T> implements List<T>
{
    class ListNode<T>
    {
        T val;
        ListNode<T> next;
        ListNode(){}
        ListNode(T val)
        {
            this.val = val;
            this.next = null;
        }

    }

    private ListNode<T> head; //Dummy
    private ListNode<T> tail;
    private int size = 0;

    public LinkedList()
    {
        head = new ListNode<T>();
        tail = head;
    }

    public ListNode<T> getHeadNode()
    {
        return head.next;
    }

    public ListNode<T> getTailNode()
    {
        return tail;
    }

    @Override
    public void add(T value)
    {
        ListNode<T> newListNode = new ListNode<>(value);
        tail.next = newListNode;
        tail = newListNode;
        size++;
    }

    @Override
    public boolean remove(T value)
    {
        ListNode<T> temp = head.next;
        ListNode<T> pre = head;
        while(temp != null)
        {
            if(temp.val.equals(value))
            {
                pre.next = temp.next;
                return true;
            }
            pre = temp;
            temp = temp.next;
        }
        return false;
    }

    @Override
    public boolean isEmpty()
    {
        return head.next == null;
    }

    @Override
    public void remove(int index)
    {
        if(index >= size) throw new IndexOutOfBoundsException("Index out of bound!");

        ListNode<T> temp = head.next;
        ListNode<T> pre = head;

        for(int i = 0; i < index; i++)
        {
            pre = temp;
            temp = temp.next;
        }
        pre.next = temp.next;
    }

    @Override
    public T get(int index)
    {
        if(index >= size) throw new IndexOutOfBoundsException("Index out of bound!");
        ListNode<T> temp = head.next;
        for(int i = 0; i < index; i++)
            temp = temp.next;
        return temp.val;
    }

    @Override
    public void set(T value, int index)
    {
        if(index >= size) throw new IndexOutOfBoundsException("Index out of bound!");
        ListNode<T> temp = head.next;
        for(int i = 0; i < index; i++)
            temp = temp.next;
        temp.val = value;
    }

    @Override
    public Iterator<T> getIterator()
    {
        return new LinkedListIterator<>(this);
    }

    @Override
    public int size()
    {
        return size;
    }
}
