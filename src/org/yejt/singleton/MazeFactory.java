package org.yejt.singleton;

import org.yejt.maze.Door;
import org.yejt.maze.Maze;
import org.yejt.maze.Room;
import org.yejt.maze.Wall;

/**
 * Created by Yejt on 2017/8/13 0013.
 */
public class MazeFactory
{
    private static MazeFactory mazeFactory;

    protected MazeFactory(){}

    public static MazeFactory getMazeFactory()
    {
        return mazeFactory == null ? new MazeFactory() : mazeFactory;
    }

    public Maze makeMaze()
    {
        return new Maze();
    }

    public Wall makeWall()
    {
        return new Wall();
    }

    public Door makeDoor(Room r1, Room r2)
    {
        return new Door(r1, r2);
    }

    public Room makeRoom(int id)
    {
        return new Room(id);
    }
}
