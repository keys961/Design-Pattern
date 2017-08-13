package org.yejt.mazebuilder;

import org.yejt.maze.*;

/**
 * Created by Yejt on 2017/8/13 0013.
 */
public class StandardMazeBuilder extends MazeBuilder
{
    private Maze maze = new Maze();

    private Direction[] getCommonSize(Room r1, Room r2)
    {
        Direction[] directions = new Direction[2];
        Direction[] r1Directions = new Direction[]{Direction.NORTH, Direction.SOUTH,
            Direction.WEST, Direction.EAST};
        Direction[] r2Directions = new Direction[]{Direction.SOUTH, Direction.NORTH,
                Direction.EAST, Direction.WEST};

        for(int i = 0; i < 4; i++)
        {
            if(r1.getSide(r1Directions[i]) instanceof Wall &&
                    r2.getSide(r2Directions[i]) instanceof Wall)
            {
                directions[0] = r1Directions[i];
                directions[1] = r2Directions[i];
                return directions;
            }
        }
        return null;
    }

    public StandardMazeBuilder()
    {
        super();
    }

    @Override
    public void buildRoom(int roomId)
    {
        Room r = new Room(roomId);
        r.setSide(Direction.NORTH, new Wall());
        r.setSide(Direction.EAST, new Wall());
        r.setSide(Direction.SOUTH, new Wall());
        r.setSide(Direction.WEST, new Wall());
        maze.addRoom(r);
    }

    @Override
    public void buildDoor(int roomFrom, int roomTo)
    {
        Room r1 = maze.getRoomByRoomNo(roomFrom);
        Room r2 = maze.getRoomByRoomNo(roomTo);
        Door d = new Door(r1, r2);
        Direction[] directions = getCommonSize(r1, r2);
        if(directions != null)
        {
            r1.setSide(directions[0], d);
            r2.setSide(directions[1], d);
        }
    }

    @Override
    public Maze getMaze()
    {
        return this.maze;
    }
}
