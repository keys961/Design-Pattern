package org.yejt.maze;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yejt on 2017/7/28 0028.
 */
public class Maze
{
    private List<Room> roomList = new ArrayList<>();

    public Maze()
    {
        roomList.clear();
    }

    public void addRoom(Room room)
    {
        roomList.add(room);
    }

    public Room getRoomByRoomNo(int roomNo)
    {
        for(Room room : roomList)
        {
            if(room.roomNumber == roomNo)
                return room;
        }
        return null;
    }
}
