package org.yejt.maze;

/**
 * Created by Yejt on 2017/8/12 0012.
 */
public abstract class MazeFactory
{
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
