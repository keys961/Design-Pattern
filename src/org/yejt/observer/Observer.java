package org.yejt.observer;

/**
 * Created by Yejt on 2017/8/31 0031.
 */
public abstract class Observer
{
    protected Subject subject;

    public abstract void update();
}
