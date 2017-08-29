package org.yejt.template;

/**
 * Created by Yejt on 2017/8/29 0029.
 */
public class Main
{
    public static void main(String[] args)
    {
        Game game = new FootballGame();
        game.play();
        game = new CricketGame();
        game.play();
    }
}
