package org.yejt.mazefactory;

import org.yejt.maze.Maze;

import java.util.Scanner;

/**
 * Created by Yejt on 2017/8/14 0014.
 */
public class Main
{
    public static void main(String[] args)
    {
        MazeGame mazeGame = new EnchantedMazeGame();
        Maze a = mazeGame.createMaze();
        String direction;
        Scanner in = new Scanner(System.in);
        while(!(direction = in.next()).equals("q"))
        {
            mazeGame.gotoNextRoom(direction);
        }
    }

}
