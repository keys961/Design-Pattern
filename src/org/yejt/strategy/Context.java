package org.yejt.strategy;

/**
 * Created by Yejt on 2017/9/1 0001.
 */
public class Context
{
    private Strategy strategy;

    public Context(Strategy strategy)
    {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2)
    {
        return strategy.operate(num1, num2);
    }
}
