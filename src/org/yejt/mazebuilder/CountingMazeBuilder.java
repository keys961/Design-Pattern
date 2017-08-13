package org.yejt.mazebuilder;

import org.yejt.maze.Maze;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yejt on 2017/8/13 0013.
 */
public class CountingMazeBuilder extends MazeBuilder
{
    private int doors = 0;
    private int rooms = 0;

    public void buildMaze()
    {

    }

    public List<Integer> getCounts()
    {
        List<Integer> list = new ArrayList<>();
        list.add(doors);
        list.add(rooms);
        return list;
    }

    @Override
    public void buildRoom(int id)
    {
        rooms++;
    }

    @Override
    public void buildDoor(int roomFrom, int roomTo)
    {
        doors++;
    }

    @Override
    public Maze getMaze()
    {
        return new Maze();
    }
}
