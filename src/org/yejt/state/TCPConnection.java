package org.yejt.state;

/**
 * Created by Yejt on 2017/8/31 0031.
 */
public class TCPConnection
{
    private TCPState state;

    public TCPConnection()
    {
        state = TCPClosed.getInstance();
        System.out.println("TCP Connection initialized.");
        System.out.println(state.toString());
    }


    public void open()
    {
        state.open(this);
    }

    public void close()
    {
        state.close(this);
    }

    public void ackowledge()
    {
        state.acknowledge(this);
    }

    public TCPState getState()
    {
        return this.state;
    }

    public void setState(TCPState state)
    {
        this.state = state;
    }

}
