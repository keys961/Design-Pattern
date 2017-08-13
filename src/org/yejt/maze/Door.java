package org.yejt.maze;

/**
 * Created by Yejt on 2017/7/28 0028.
 */
public class Door extends MapSite
{
    private boolean isOpen;
    private boolean flag = false;
    private Room room1;
    private Room room2;

    public Door()
    {
        room1 = room2 = null;
        isOpen = true;
    }

    public Door(Room room1)
    {
        this.room1 = room1;
        room2 = null;
        isOpen = true;
    }

    public Door(Room room1, Room room2)
    {
        this.room1 = room1;
        this.room2 = room2;
        isOpen = true;
    }

    public MapSite enter()
    {
        return null;
    }

    public Room otherSideFrom(Room room)
    {
        if(room.equals(room1))
            return room2;
        else if(room.equals(room2))
            return room1;
        else
            return null;
    }
}
