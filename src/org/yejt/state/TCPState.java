package org.yejt.state;

/**
 * Created by Yejt on 2017/8/31 0031.
 */
public abstract class TCPState
{
    public abstract void open(TCPConnection connection);

    public abstract void close(TCPConnection connection);

    public abstract void acknowledge(TCPConnection connection);
}
