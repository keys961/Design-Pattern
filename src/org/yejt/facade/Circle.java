package org.yejt.facade;

/**
 * Created by Yejt on 2017/8/21 0021.
 */
public class Circle implements Shape
{
    private int radius;

    public Circle(int radius)
    {
        this.radius = radius;
    }

    @Override
    public void draw()
    {
        System.out.println(String.format("This is a circle with radius %d", radius));
    }
}
