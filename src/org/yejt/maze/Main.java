package org.yejt.maze;

import java.util.Scanner;

/**
 * Created by Yejt on 2017/8/12 0012.
 */
public class Main
{
    public static void main(String args[])
    {
        MazeFactory mazeFactory = new EnchantedMazeFactory();
        MazeGame mazeGame = new MazeGame();
        mazeGame.createMaze(mazeFactory);

        String direction;
        Scanner in = new Scanner(System.in);
        while(!(direction = in.next()).equals("q"))
        {
            mazeGame.gotoNextRoom(direction);
        }
    }
}
