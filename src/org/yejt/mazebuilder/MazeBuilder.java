package org.yejt.mazebuilder;

import org.yejt.maze.Maze;

/**
 * Created by Yejt on 2017/8/13 0013.
 */
public abstract class MazeBuilder
{
    protected MazeBuilder(){}

    public void buildRoom(int roomId){}

    public void buildDoor(int roomFrom, int roomTo){}

    public Maze getMaze()
    {
        return null;
    }
}
