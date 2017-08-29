package org.yejt.template;

/**
 * Created by Yejt on 2017/8/29 0029.
 */
public class FootballGame extends Game {

    @Override
    protected void endPlay()
    {
        System.out.println("Football Game Finished!");
    }

    @Override
    protected void initialize()
    {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    protected void startPlay()
    {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
