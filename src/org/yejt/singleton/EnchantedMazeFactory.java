package org.yejt.singleton;

import org.yejt.maze.*;

/**
 * Created by Yejt on 2017/8/13 0013.
 */
public class EnchantedMazeFactory extends MazeFactory
{
    static private MazeFactory mazeFactory;

    private EnchantedMazeFactory()
    {
        super();
    }

    public static MazeFactory getMazeFactory()
    {
        if(mazeFactory == null)
            mazeFactory = new EnchantedMazeFactory();
        return mazeFactory;
    }

    @Override
    public Maze makeMaze()
    {
        return super.makeMaze();
    }

    @Override
    public Wall makeWall()
    {
        return super.makeWall();
    }

    @Override
    public Door makeDoor(Room r1, Room r2)
    {
        return new EnchantedDoor(r1, r2, "Hello");
    }

    @Override
    public Room makeRoom(int id)
    {
        return new EnchantedRoom(id, "Hello");
    }
}
