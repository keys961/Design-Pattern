package org.yejt.observer;

import java.util.*;

/**
 * Created by Yejt on 2017/8/31 0031.
 */
public class ClockTimer extends Subject
{
    public int getHour()
    {
        return Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
    }

    public int getMinute()
    {
        return Calendar.getInstance().get(Calendar.MINUTE);
    }

    public int getSecond()
    {
        return Calendar.getInstance().get(Calendar.SECOND);
    }

    public void tick() //Notify
    {
        notifyAllObserver();
    }
}
