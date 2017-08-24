package org.yejt.flyweight;

import java.util.HashMap;

/**
 * Created by Yejt on 2017/8/24 0024.
 */
public class ShapeFactory
{
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) //Shared
    {
        if(circleMap.containsKey(color))
            return circleMap.get(color);
        circleMap.put(color, new Circle(color));
        System.out.println("Creating circle of color : " + color);
        return circleMap.get(color);
    }

    public static Shape getCircleComposite() //Unshared
    {
        System.out.println("Creating circle composition");
        return new CircleComposite();
    }
}
