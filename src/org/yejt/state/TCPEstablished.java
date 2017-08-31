package org.yejt.state;

/**
 * Created by Yejt on 2017/8/31 0031.
 */
public class TCPEstablished extends TCPState
{
    private static TCPEstablished ourInstance = new TCPEstablished();

    public static TCPEstablished getInstance()
    {
        return ourInstance;
    }

    private TCPEstablished()
    {

    }

    @Override
    public void open(TCPConnection connection)
    {
        System.out.println("TCP Connection Established.");
    }

    @Override
    public void close(TCPConnection connection)
    {
        connection.setState(TCPClosed.getInstance());
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
        return "Current state: " + "Established";
    }
}
