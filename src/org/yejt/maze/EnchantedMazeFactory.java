package org.yejt.maze;

/**
 * Created by Yejt on 2017/8/12 0012.
 */
public class EnchantedMazeFactory extends MazeFactory
{
    @Override
    public Wall makeWall() {
        return super.makeWall();
    }

    @Override
    public Door makeDoor(Room r1, Room r2) {
        return new EnchantedDoor(r1, r2, "Hello");
    }

    @Override
    public Room makeRoom(int id) {
        return new EnchantedRoom(id, "Surprise motherf**ker!");
    }
}
