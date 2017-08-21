package org.yejt.facade;

/**
 * Created by Yejt on 2017/8/21 0021.
 */
public class Square extends Rectangle
{
    public Square(int length)
    {
        super(length, length);
    }

    public void draw()
    {
        System.out.println(String.format("This is a square with length %d", length));
    }

}
