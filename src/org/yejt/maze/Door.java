package org.yejt.maze;

/**
 * Created by Yejt on 2017/7/28 0028.
 */
public class Door extends MapSite
{
    private boolean isOpen;
    private boolean flag = false;
    protected Room room1;
    protected Room room2;

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

    @Override
    public Object clone() throws CloneNotSupportedException {
        Door newDoor = new Door((Room)room1.clone(), (Room)room2.clone());
        return newDoor;
    }

    public MapSite enter()
    {
        return null;
    }

    public void setRoom(Room r1, Room r2)
    {
        this.room2 = r2;
        this.room1 = r1;
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
