package org.yejt.maze;

/**
 * Created by Yejt on 2017/7/28 0028.
 */
public class MazeGame
{
    private Room currentRoom;

    public Maze createMaze(MazeFactory mazeFactory)
    {
        Maze aMaze = mazeFactory.makeMaze();
        Room r1 = mazeFactory.makeRoom(1);
        Room r2 = mazeFactory.makeRoom(2);
        Door theDoor = new Door(r1, r2);
        aMaze.addRoom(r1);
        aMaze.addRoom(r2);
        r1.setSide(Direction.NORTH, mazeFactory.makeWall());
        r1.setSide(Direction.EAST, theDoor);
        r1.setSide(Direction.SOUTH, mazeFactory.makeWall());
        r1.setSide(Direction.WEST, mazeFactory.makeWall());

        r2.setSide(Direction.NORTH, mazeFactory.makeWall());
        r2.setSide(Direction.EAST, mazeFactory.makeWall());
        r2.setSide(Direction.SOUTH, mazeFactory.makeWall());
        r2.setSide(Direction.WEST, theDoor);
        //Float a = new Float(1.0f);
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

}
