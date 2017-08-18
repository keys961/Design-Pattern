package org.yejt.decorator;

/**
 * Created by Yejt on 2017/8/18 0018.
 */
public class TextView extends Component
{
    private int size;

    public TextView(int size)
    {
        this.size = size;
    }

    @Override
    public void draw()
    {
        System.out.print("This is a TEXT-VIEW with size " + this.size);
    }

    @Override
    public void resize(int size)
    {
        this.size = size;
    }
}
