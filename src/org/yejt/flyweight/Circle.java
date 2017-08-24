package org.yejt.flyweight;

/**
 * Created by Yejt on 2017/8/24 0024.
 */
public class Circle implements Shape
{
    private int x; // Outer states, not shared
    private int y;
    private int radius;
    private String color; // Intrinsic state, shared

    public Circle(String color)
    {
        this.color = color;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    public String getColor()
    {
        return this.color;
    }

    @Override
    public void draw()
    {
        System.out.println("Circle: Draw() [Color : " + color
                +", x : " + x +", y :" + y +", radius :" + radius + "]");
    }

    public Shape clone()
    {
        Circle cloneCircle = new Circle(this.color);
        cloneCircle.x = this.x;
        cloneCircle.y = this.y;
        cloneCircle.radius = this.radius;
        return cloneCircle;
    }
}
