package org.yejt.composition;

/**
 * Created by Yejt on 2017/8/23 0023.
 */
public class FloppyDisk extends Equipment
{
    public FloppyDisk(String name)
    {
        super(name);
    }

    @Override
    public double getPower()
    {
        return 0.1;
    }

    @Override
    public double getPrice()
    {
        return 2.5;
    }

    @Override
    public double getDiscountPrice()
    {
        return getPrice() * 0.8;
    }
}
