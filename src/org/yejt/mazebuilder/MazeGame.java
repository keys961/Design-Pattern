package org.yejt.mazebuilder;

import org.yejt.maze.*;

/**
 * Created by Yejt on 2017/8/13 0013.
 */
public class MazeGame
{
    private Room currentRoom;

    public Maze createMaze(MazeBuilder mazeBuilder)
    {
        for(int i = 0; i < 10; i++)
            mazeBuilder.buildRoom(i);
        for(int i = 0; i < 9; i++)
            mazeBuilder.buildDoor(i, i + 1);
        Maze aMaze = mazeBuilder.getMaze();
        currentRoom = aMaze.getRoomByRoomNo(1);
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
}
