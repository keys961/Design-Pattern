package org.yejt.decorator;

/**
 * Created by Yejt on 2017/8/18 0018.
 */
public abstract class Decorator extends Component
{
    protected Component component;

    public Decorator(Component component)
    {
        this.component = component;
    }

    @Override
    public void draw()
    {
        component.draw();  //Default, decorate nothing
    }

    @Override
    public void resize(int size)
    {
        component.resize(size);//Default, decorate nothing
    }
}
