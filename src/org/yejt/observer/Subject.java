package org.yejt.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yejt on 2017/8/31 0031.
 */
public abstract class Subject
{
    private List<Observer> observers = new ArrayList<>();

    public void attachObserver(Observer observer)
    {
        observers.add(observer);
    }

    public void detachObserver(Observer observer)
    {
        observers.remove(observer);
    }

    public void notifyAllObserver()
    {
        for(Observer o : observers)
            o.update();
    }
}
