package org.yejt.adapter;

/**
 * Created by Yejt on 2017/8/21 0021.
 */
public class Main
{
    public static void main(String[] args)
    {
        Manipulator manipulator = new TextShape(new TextView()).createManipulator();
        manipulator.maniplate();
    }

}
