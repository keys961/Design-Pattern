package org.yejt.mazebuilder;

import org.yejt.maze.*;

import java.util.Scanner;

/**
 * Created by Yejt on 2017/8/12 0012.
 */
public class Main
{
    public static void main(String[] args)
    {
        MazeGame mazeGame = new MazeGame();
        MazeBuilder mazeBuilder = new StandardMazeBuilder();
        mazeGame.createMaze(mazeBuilder);
        String direction;
        Scanner in = new Scanner(System.in);
        while(!(direction = in.next()).equals("q"))
            mazeGame.gotoNextRoom(direction);
        CountingMazeBuilder mazeBuilder1 = new CountingMazeBuilder();
        mazeGame.createMaze(mazeBuilder1);
        System.out.println(mazeBuilder1.getCounts());
    }
}
