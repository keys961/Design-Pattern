package org.yejt.observer;

/**
 * Created by Yejt on 2017/8/30 0030.
 */
public class Main
{
    public static void main(String[] args)
    {
        ClockTimer timer = new ClockTimer();

        DigitalClock digitalClock = new DigitalClock(timer);

        AnalogClock analogClock = new AnalogClock(timer);

        timer.notifyAllObserver();
    }
}
