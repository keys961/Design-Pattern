package org.yejt.maze;

/**
 * Created by Yejt on 2017/7/28 0028.
 */
public class Wall extends MapSite
{
    public MapSite enter()
    {
        System.out.println("This is a wall!");
        return null;
    }
}
