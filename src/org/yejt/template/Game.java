package org.yejt.template;

/**
 * Created by Yejt on 2017/8/29 0029.
 */
public abstract class Game
{
    protected abstract void initialize();

    protected abstract void startPlay();

    protected abstract void endPlay();

    public final void play()
    {
        initialize();
        startPlay();
        endPlay();
    }

}
