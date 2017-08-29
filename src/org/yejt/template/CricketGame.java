package org.yejt.template;

/**
 * Created by Yejt on 2017/8/29 0029.
 */
public class CricketGame extends Game
{
    @Override
    protected void initialize()
    {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    protected void startPlay()
    {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    @Override
    protected void endPlay()
    {
        System.out.println("Cricket Game Finished!");
    }

}
