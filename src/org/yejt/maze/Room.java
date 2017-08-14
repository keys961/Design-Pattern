package org.yejt.maze;

/**
 * Created by Yejt on 2017/7/28 0028.
 */
public class Room extends MapSite
{
    protected MapSite[] sides = new MapSite[4];

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

    public void setRoomNumber(int id)
    {
        this.roomNumber = id;
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
    public Object clone() throws CloneNotSupportedException {
        Room newRoom = new Room();
        newRoom.setSide(Direction.NORTH, sides[0]);
        newRoom.setSide(Direction.SOUTH, sides[1]);
        newRoom.setSide(Direction.EAST, sides[2]);
        newRoom.setSide(Direction.WEST, sides[3]);
        newRoom.setRoomNumber(this.roomNumber);
        return newRoom;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(!(obj instanceof Room))
            return false;
        return ((Room) obj).roomNumber == this.roomNumber;
    }
}
