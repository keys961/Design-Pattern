package org.yejt.chain;

/**
 * Created by Yejt on 2017/8/27 0027.
 */
public abstract class Logger
{
    public static final int INFO = 0;
    public static final int DEBUG = 1;
    public static final int ERROR = 2;

    protected int level;
    protected Logger nextLogger;

    public void setNextLogger(Logger nextLogger)
    {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message)
    {
        if(this.level <= level)
            write(message);
        if(nextLogger != null)
            nextLogger.logMessage(level, message);
    }

    protected abstract void write(String message);
}
