package org.yejt.chain;

/**
 * Created by Yejt on 2017/8/27 0027.
 */
public class ErrorLogger extends Logger
{
    public ErrorLogger(int level)
    {
        this.level = level;
    }

    @Override
    protected void write(String message)
    {
        System.out.println("Error Console::Logger: " + message);
    }
}
