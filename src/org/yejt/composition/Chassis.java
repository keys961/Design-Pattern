package org.yejt.composition;

/**
 * Created by Yejt on 2017/8/23 0023.
 */
public class Chassis extends Equipment
{
    public Chassis(String name)
    {
        super(name);
    }

    @Override
    public double getPower()
    {
        return 0;
    }

    @Override
    public double getPrice()
    {
        return 5.0;
    }

    @Override
    public double getDiscountPrice()
    {
        return getPrice() * 0.75;
    }
}
