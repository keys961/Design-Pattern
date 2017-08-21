package org.yejt.adapter;

/**
 * Created by Yejt on 2017/8/21 0021.
 */
public interface Shape
{
    public void bindingBox(Point x, Point y);
    public Manipulator createManipulator();
}
