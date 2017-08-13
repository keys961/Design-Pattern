package org.yejt.singleton;

import org.yejt.maze.EnchantedDoor;

/**
 * Created by Yejt on 2017/8/13 0013.
 */
public class Main
{
    public static void main(String args[])
    {
        MazeFactory mazeFactory = EnchantedMazeFactory.getMazeFactory();
        System.out.println("Hash code:" + mazeFactory.hashCode());
        MazeFactory mazeFactory2 = EnchantedMazeFactory.getMazeFactory();
        System.out.println("Hash code:" + mazeFactory2.hashCode());

        MazeFactory mazeFactory1 = StandardMazeFactory.getMazeFactory();
        System.out.println("Hash code:" + mazeFactory1.hashCode());
        mazeFactory1 = StandardMazeFactory.getMazeFactory();
        System.out.println("Hash code:" + mazeFactory1.hashCode());
    }
}
