package org.yejt.adapter;

/**
 * Created by Yejt on 2017/8/21 0021.
 */
public class TextShape implements Shape
{
    private TextView textView;

    private Point pointX;
    private Point pointY;

    public TextShape(TextView textView)
    {
        super();
        this.textView = textView;
    }

    @Override
    public void bindingBox(Point x, Point y)
    {
        this.pointX = x;
        this.pointY = y;
    }

    @Override
    public Manipulator createManipulator()
    {
        return new TextManipulator(this);
    }

    public TextView getTextView()
    {
        return this.textView;
    }

}
