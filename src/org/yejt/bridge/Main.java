package org.yejt.bridge;

/**
 * Created by Yejt on 2017/8/22 0022.
 */
public class Main
{
    public static void main(String[] args)
    {
        Shape shape = new Circle(CircleImp.newInstance(), 1,2,3);
        shape.draw();
        System.out.println();
        Shape greenShape = new Circle(GreenCircleImp.newInstance(), 2,3,4);
        greenShape.draw();
    }
}
