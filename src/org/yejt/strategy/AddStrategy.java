package org.yejt.strategy;

/**
 * Created by Yejt on 2017/9/1 0001.
 */
public class AddStrategy implements Strategy
{
    @Override
    public int operate(int num1, int num2)
    {
        return num1 + num2;
    }
}
