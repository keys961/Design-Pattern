package org.yejt.composition;

/**
 * Created by Yejt on 2017/8/23 0023.
 */
public class Cabinet extends Equipment
{
    public Cabinet(String name)
    {
        super(name);
    }

    @Override
    public double getPower()
    {
        return 1.5;
    }

    @Override
    public double getPrice() {
        return 10.5;
    }

    @Override
    public double getDiscountPrice() {
        return getPrice() * 0.95;
    }
}
