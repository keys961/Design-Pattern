package org.yejt.decorator;

/**
 * Created by Yejt on 2017/8/18 0018.
 */
public class BoarderDecorator extends Decorator
{
    private int size;

    public BoarderDecorator(Component component, int boarderSize)
    {
        super(component);
        this.size = boarderSize;
    }

    @Override
    public void draw()
    {
        //component.draw();
        super.draw();
        this.drawBoarder();
    }

    @Override
    public void resize(int size)
    {
        this.size = size;
    }

    private void drawBoarder()
    {
        System.out.print(" with a BOARDER of size " + size);
    }
}
