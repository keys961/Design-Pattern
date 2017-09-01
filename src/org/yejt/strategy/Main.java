package org.yejt.strategy;

/**
 * Created by Yejt on 2017/9/1 0001.
 */
public class Main
{
    public static void main(String[] args)
    {
        Context context = new Context(new AddStrategy());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new MinusStrategy());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new MultiplyStrategy());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
