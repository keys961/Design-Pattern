package org.yejt.bridge;

/**
 * Created by Yejt on 2017/8/22 0022.
 */
public class Circle extends Shape
{
    private int radius;
    private int x;
    private int y;

    public Circle(ShapeImp shapeImp)
    {
        super(shapeImp);
        this.x = this.y = this.radius = 0;
    }

    public Circle(ShapeImp shapeImp, int x, int y, int radius)
    {
        super(shapeImp);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int getRadius()
    {
        return this.radius;
    }

    public int getX()
    {
        return this.x;
    }

    public int getY()
    {
        return this.y;
    }

    @Override
    public void draw()
    {
        shapeImp.draw(this);
    }
}
