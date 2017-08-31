package org.yejt.state;

/**
 * Created by Yejt on 2017/8/31 0031.
 */
public class TCPListen extends TCPState
{
    private static TCPListen ourInstance = new TCPListen();

    public static TCPListen getInstance()
    {
        return ourInstance;
    }

    private TCPListen()
    {
    }

    @Override
    public void open(TCPConnection connection)
    {
        System.out.println("TCP Connection already Opened.");
    }

    @Override
    public void close(TCPConnection connection)
    {
        connection.setState(TCPClosed.getInstance());
        System.out.println("TCP Connection Closed.");
    }

    @Override
    public String toString()
    {
        return "Current state: " + "Listening";
    }

    @Override
    public void acknowledge(TCPConnection connection)
    {
        System.out.println("TCP Server Listening...");
    }
}
