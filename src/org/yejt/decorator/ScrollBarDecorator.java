package org.yejt.decorator;

/**
 * Created by Yejt on 2017/8/18 0018.
 */
public class ScrollBarDecorator extends Decorator
{
    private int direction;
    private int scrollSize;

    public ScrollBarDecorator(Component component, int scrollSize, int direction)
    {
        super(component);

        this.direction = direction;
        this.scrollSize = scrollSize;
    }

    @Override
    public void draw()
    {
        //component.draw();
        super.draw();
        this.drawScrollBar();
    }

    @Override
    public void resize(int size)
    {
        this.scrollSize = size;
    }

    private void drawScrollBar()
    {
        String direct = "";
        switch (direction)
        {
            case Direction.VERTICAL:
                direct = "vertical";
                break;

            case Direction.HORIZONTAL:
                direct = "horizontal";
                break;
        }
        System.out.print(" with a " + direct + " SCROLL BAR of size " + scrollSize);
    }
}
