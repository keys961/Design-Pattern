package org.yejt.decorator;

/**
 * Created by Yejt on 2017/8/18 0018.
 */
public class Main
{
    public static void main(String[] args)
    {
        Component component = new ScrollBarDecorator(
                new BoarderDecorator(new TextView(20), 15), 15, Direction.HORIZONTAL);

        component.draw();
    }
}
