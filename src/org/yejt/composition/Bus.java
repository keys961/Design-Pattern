package org.yejt.composition;

/**
 * Created by Yejt on 2017/8/23 0023.
 */
public class Bus extends Equipment
{
    protected Bus(String name)
    {
        super(name);
    }

    @Override
    public double getPower()
    {
        return 5.0;
    }

    @Override
    public double getPrice() {
        return 25.5;
    }

    @Override
    public double getDiscountPrice() {
        return getPrice() * 0.99;
    }
}
