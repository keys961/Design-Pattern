package org.yejt.mazeprototype;

import org.yejt.maze.*;

/**
 * Created by Yejt on 2017/8/14 0014.
 */
public class MazePrototypeFactory extends MazeFactory
{
    private Maze prototypeMaze;
    private Wall prototypeWall;
    private Room prototypeRoom;
    private Door prototypeDoor;

    public MazePrototypeFactory(Maze maze, Wall wall, Room room, Door door)
    {
        super();
        this.prototypeDoor = door;
        this.prototypeMaze = maze;
        this.prototypeRoom = room;
        this.prototypeWall = wall;
    }

    @Override
    public Maze makeMaze()
    {
        Maze maze = null;
        try
        {
            maze = (Maze)prototypeMaze.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return maze;
    }

    @Override
    public Wall makeWall()
    {
        Wall wall = null;
        try
        {
            wall = (Wall)prototypeWall.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return wall;
    }

    @Override
    public Door makeDoor(Room r1, Room r2)
    {
        Door door = null;
        try
        {
            door = (Door)prototypeDoor.clone();
            door.setRoom(r1, r2);
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return door;
    }

    @Override
    public Room makeRoom(int id)
    {
        Room room = null;
        try
        {
            room = (Room)prototypeRoom.clone();
            room.setRoomNumber(id);
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return room;
    }
}
