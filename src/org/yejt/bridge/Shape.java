package org.yejt.bridge;

/**
 * Created by Yejt on 2017/8/22 0022.
 */
public abstract class Shape
{
    protected ShapeImp shapeImp;

    protected Shape(ShapeImp shapeImp)
    {
        this.shapeImp = shapeImp;
    }

    public abstract void draw();
}
