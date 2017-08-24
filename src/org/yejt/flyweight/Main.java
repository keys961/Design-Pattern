package org.yejt.flyweight;

/**
 * Created by Yejt on 2017/8/24 0024.
 */
public class Main
{
    private static final String colors[] =
            { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args)
    {
        CircleComposite circleComposite =
                (CircleComposite)ShapeFactory.getCircleComposite();

        for(int i = 0; i < 20; i++)
        {
            Circle circle =
                    (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();

            circleComposite.addShape(circle);
        }
        System.out.println();
        circleComposite.draw();
    }
    private static String getRandomColor()
    {
        return colors[(int)(Math.random() * colors.length)];
    }

    private static int getRandomX()
    {
        return (int)(Math.random() * 100 );
    }

    private static int getRandomY()
    {
        return (int)(Math.random() * 100);
    }
}
