package org.yejt.facade;

/**
 * Created by Yejt on 2017/8/21 0021.
 */
public class ShapeMaker
{
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker()
    {
        circle = new Circle(5);
        rectangle = new Rectangle(5,6);
        square = new Square(6);
    }

    public void drawCircle()
    {
        circle.draw();
    }

    public void drawRectangle()
    {
        rectangle.draw();
    }

    public void drawSquare()
    {
        square.draw();
    }
}
