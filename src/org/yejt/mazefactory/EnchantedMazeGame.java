package org.yejt.mazefactory;

import org.yejt.maze.Door;
import org.yejt.maze.EnchantedDoor;
import org.yejt.maze.EnchantedRoom;
import org.yejt.maze.Room;

/**
 * Created by Yejt on 2017/8/14 0014.
 */
public class EnchantedMazeGame extends MazeGame
{
    @Override
    public Room makeRoom(int id)
    {
        return new EnchantedRoom(id, "Hello motherf**ker!");
    }

    @Override
    public Door makeDoor(Room r1, Room r2)
    {
        return new EnchantedDoor(r1, r2, "F**k you");
    }
}
