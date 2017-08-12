package org.yejt.maze;

import java.util.Scanner;

/**
 * Created by Yejt on 2017/8/12 0012.
 */
public class EnchantedDoor extends Door
{
    private String words;

    public EnchantedDoor(Room r1, Room r2, String words)
    {
        super(r1, r2);
        this.words = words;
    }

    public MapSite enter()
    {
        String s;
        Scanner in = new Scanner(System.in);
        s = in.next();
        if(s.equals(words))
            return super.enter();
        else
        {
            System.out.println("Passwords incorrect!");
            return null;
        }
    }
}
