package org.yejt.flyweight;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yejt on 2017/8/24 0024.
 */
public class CircleComposite implements Shape
{
    private List<Shape> list;

    public CircleComposite()
    {
        list = new ArrayList<Shape>();
    }

    public void addShape(Shape shape)
    {
        list.add(shape);
    }

    public void removeShape(Shape shape)
    {
        if(list.contains(shape))
            list.remove(shape);
    }

    @Override
    public Shape clone()
    {
        return this;
    }

    @Override
    public void draw()
    {
        int i = 1;
        for(Shape shape : list)
            System.out.println("Circle " + i++ + " color: " + ((Circle)shape).getColor());
    }
}
