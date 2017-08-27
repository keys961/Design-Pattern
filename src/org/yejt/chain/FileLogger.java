package org.yejt.chain;

/**
 * Created by Yejt on 2017/8/27 0027.
 */
public class FileLogger extends Logger
{
    public FileLogger(int level)
    {
        this.level = level;
    }

    @Override
    protected void write(String message)
    {
        System.out.println("File::Logger: " + message);
    }
}
