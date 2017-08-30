package org.yejt.memento;

import java.util.*;

/**
 * Created by Yejt on 2017/8/29 0029.
 */
public class CareTaker
{
    private Stack<Memento> mementoList = new Stack<>();

//    private Originator originator;
//
//    public CareTaker(Originator originator)
//    {
//        this.originator = originator;
//    }

    public void addMomento(Memento memento)
    {
        mementoList.add(memento);
    }

    public Memento getMomento()
    {
        if(mementoList.isEmpty())
            return null;
        return mementoList.pop();
    }
}
