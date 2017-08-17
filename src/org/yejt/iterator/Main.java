package org.yejt.iterator;

/**
 * Created by Yejt on 2017/8/17 0017.
 */
public class Main
{
    public static void main(String[] args)
    {
        List<Integer> list = new LinkedList<>();
        for(int i = 0; i < 100; i++)
            list.add(i);

        Iterator<Integer> it = list.getIterator();

        while(it.hasNext())
        {
            System.out.print(it.getCurrentValue() + "\n");
            it.moveToNext();
        }
        if(it.isLast())
            System.out.print(it.getCurrentValue() + "\n");
    }
}
