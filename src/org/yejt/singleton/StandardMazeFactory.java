package org.yejt.singleton;

/**
 * Created by Yejt on 2017/8/13 0013.
 */
public class StandardMazeFactory extends MazeFactory
{
    static private MazeFactory mazeFactory;

    private StandardMazeFactory(){}

    public static MazeFactory getMazeFactory()
    {
        if(mazeFactory == null)
            mazeFactory = new StandardMazeFactory();
        return mazeFactory;
    }
}
