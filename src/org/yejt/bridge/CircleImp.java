package org.yejt.bridge;

/**
 * Created by Yejt on 2017/8/22 0022.
 */
public class CircleImp implements ShapeImp
{
    private static CircleImp circleImp;

    protected CircleImp(){}

    public static ShapeImp newInstance()
    {
        if(circleImp == null)
            return circleImp = new CircleImp();
        return circleImp;
    }

    public void draw(Shape shape)
    {
        Circle circle;
        if(shape instanceof Circle)
            circle = (Circle)shape;
        else
            return;
        System.out.print(String.format("Circle is drawn at (%d, %d) with radius %d",
                circle.getX(), circle.getY(), circle.getRadius()));
    }
}
