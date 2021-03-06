package org.yejt.bridge;

/**
 * Created by Yejt on 2017/8/22 0022.
 */
public class GreenCircleImp extends CircleImp
{
    private static GreenCircleImp greenCircleImp;

    protected GreenCircleImp(){}

    public static ShapeImp newInstance()
    {
        if(greenCircleImp == null)
            return greenCircleImp = new GreenCircleImp();
        return greenCircleImp;
    }

    @Override
    public void draw(Shape shape)
    {
        super.draw(shape);
        if(shape instanceof Circle)
            System.out.print(" with color green");
    }
}
