package org.yejt.observer;

/**
 * Created by Yejt on 2017/8/31 0031.
 */
public class DigitalClock extends Observer
{
    private ClockTimer subject;

    public DigitalClock(ClockTimer clockTimer)
    {
        this.subject = clockTimer;
        subject.attachObserver(this);
    }

    @Override
    public void update()
    {
        int hour = subject.getHour();
        int minute = subject.getMinute();
        int second = subject.getSecond();

        System.out.println("Digital Clock: " +
                hour + ":" +
            minute + ":" + second);
    }
}
