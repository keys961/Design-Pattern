package org.yejt.facade;

/**
 * Created by Yejt on 2017/8/21 0021.
 */
public class Rectangle implements Shape
{
    protected int length;
    private int width;

    public Rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw()
    {
        System.out.println(String.format("This is a rectangle with length %d " +
                "and width %d", length, width));
    }
}
