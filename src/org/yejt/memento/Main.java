package org.yejt.memento;

/**
 * Created by Yejt on 2017/8/30 0030.
 */
public class Main
{
    public static void main(String[] args)
    {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State Init");
        for(int i = 1; i < 10; i++)
        {
            careTaker.addMomento(originator.saveStateToMemento());
            originator.setState("State #" + i);
        }

        System.out.println("Current State: " + originator.getState());
        originator.setState(careTaker.getMomento().getState());
        System.out.println("After Recover: " + originator.getState());
    }
}
