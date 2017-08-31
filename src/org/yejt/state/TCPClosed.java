package org.yejt.state;

/**
 * Created by Yejt on 2017/8/31 0031.
 */
public class TCPClosed extends TCPState
{

    private static TCPClosed ourInstance = new TCPClosed();

    public static TCPClosed getInstance()
    {
        return ourInstance;
    }

    private TCPClosed()
    {

    }

    @Override
    public void open(TCPConnection connection)
    {
        connection.setState(TCPEstablished.getInstance());
        System.out.println("TCP Connection Established.");
    }

    @Override
    public void close(TCPConnection connection)
    {
        System.out.println("TCP Connection Closed.");
    }

    @Override
    public void acknowledge(TCPConnection connection)
    {
        TCPState state = TCPListen.getInstance();
        connection.setState(state);
        state.acknowledge(connection);
    }

    @Override
    public String toString()
    {
        return "Current state: " + "Closed";
    }
}
