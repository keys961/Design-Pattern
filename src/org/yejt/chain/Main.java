package org.yejt.chain;

/**
 * Created by Yejt on 2017/8/27 0027.
 */
public class Main
{
    public static Logger getChainOfLogger()
    {
        Logger errorLogger = new ErrorLogger(Logger.ERROR);
        Logger fileLogger = new FileLogger(Logger.DEBUG);
        Logger consoleLogger = new ConsoleLogger(Logger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args)
    {
        Logger chainOfLogger = getChainOfLogger();

        chainOfLogger.logMessage(Logger.INFO, "INFO MESSAGE");
        System.out.println();

        chainOfLogger.logMessage(Logger.DEBUG, "DEBUG MESSAGE");
        System.out.println();

        chainOfLogger.logMessage(Logger.ERROR, "ERROR MESSAGE");
        System.out.println();
    }
}
