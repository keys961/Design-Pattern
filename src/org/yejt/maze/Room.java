package org.yejt.maze;

/**
 * Created by Yejt on 2017/7/28 0028.
 */
public class Room extends MapSite
{
    private MapSite[] sides = new MapSite[4];

    protected int roomNumber;

    public Room()
    {
        this.roomNumber = 0;
    }

    public Room(int roomNumber)
    {
        this.roomNumber = roomNumber;
    }

    public MapSite enter()
    {
        System.out.println("Normal Room :" + roomNumber);
        return this;
    }

    public MapSite getSide(Direction direction)
    {
        switch (direction)
        {
            case NORTH: return sides[0];
            case SOUTH: return sides[1];
            case EAST: return sides[2];
            case WEST: return sides[3];
        }
        return null;
    }

    public void setSide(Direction direction, MapSite side)
    {
        switch (direction)
        {
            case NORTH: sides[0] = side; break;
            case SOUTH: sides[1] = side; break;
            case EAST: sides[2] = side; break;
            case WEST: sides[3] = side; break;
        }
    }

    @Override
    public boolean equals(Object obj)
    {
        if(!(obj instanceof Room))
            return false;
        return ((Room) obj).roomNumber == this.roomNumber;
    }
}
