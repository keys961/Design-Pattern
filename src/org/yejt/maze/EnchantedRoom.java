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

}
