package org.yejt.mazefactory;

import org.yejt.maze.*;

/**
 * Created by Yejt on 2017/8/14 0014.
 */
public class MazeGame
{

    class Creator<T>
    {

        <T> T makeT(Class<T> cls)
        {
            T obj = null;
            try
            {
                obj = cls.newInstance();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            return obj;
        }

    }

    private Room currentRoom;

    public Maze createMaze()
    {
        Maze aMaze = makeMaze();
        Room r1 = makeRoom(1);
        Room r2 = makeRoom(2);
        Door door = makeDoor(r1, r2);
        aMaze.addRoom(r1);
        aMaze.addRoom(r2);

        r1.setSide(Direction.NORTH, makeWall());
        r1.setSide(Direction.EAST, door);
        r1.setSide(Direction.SOUTH, makeWall());
        r1.setSide(Direction.WEST, makeWall());

        r2.setSide(Direction.NORTH, makeWall());
        r2.setSide(Direction.EAST, makeWall());
        r2.setSide(Direction.SOUTH, makeWall());
        r2.setSide(Direction.WEST, door);

        currentRoom = r1;
        return aMaze;
    }

    public void gotoNextRoom(String direction)
    {
        Direction d;
        switch (direction)
        {
            case "N": d = Direction.NORTH; break;
            case "S": d = Direction.SOUTH; break;
            case "E": d = Direction.EAST; break;
            case "W": d = Direction.WEST; break;
            default: d = Direction.EAST;
        }
        MapSite site = currentRoom.getSide(d);
        if(site instanceof Door)
        {
            currentRoom = ((Door) site).otherSideFrom(currentRoom);
            currentRoom.enter();
        }
        else
            site.enter();
    }

    //Factory Methods
    public Maze makeMaze()
    {
        return new Maze();
    }

    public Room makeRoom(int id)
    {
        return new Room(id);
    }

    public Wall makeWall()
    {
        return new Wall();
    }

    public Door makeDoor(Room r1, Room r2)
    {
        return new Door(r1, r2);
    }


}
