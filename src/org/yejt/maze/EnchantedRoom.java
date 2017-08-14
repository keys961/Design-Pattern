package org.yejt.maze;

/**
 * Created by Yejt on 2017/8/12 0012.
 */
public class EnchantedRoom extends Room
{
    private String words;

    public EnchantedRoom(int n, String words)
    {
        super(n);
        this.words = words;
    }

    public MapSite enter()
    {
        System.out.println("Enchanted Room " + roomNumber);
        System.out.println(words);
        return this;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        EnchantedRoom newRoom = new EnchantedRoom(this.roomNumber, this.words);
        newRoom.setSide(Direction.NORTH, sides[0]);
        newRoom.setSide(Direction.SOUTH, sides[1]);
        newRoom.setSide(Direction.EAST, sides[2]);
        newRoom.setSide(Direction.WEST, sides[3]);
        newRoom.setRoomNumber(this.roomNumber);
        return newRoom;
    }
}
