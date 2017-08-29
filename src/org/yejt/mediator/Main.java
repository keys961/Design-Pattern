package org.yejt.mediator;

/**
 * Created by Yejt on 2017/8/29 0029.
 */
public class Main
{
    public static void main(String[] args)
    {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
