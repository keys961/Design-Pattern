package org.yejt.state;

/**
 * Created by Yejt on 2017/8/31 0031.
 */
public class Main
{
    public static void main(String[] args)
    {
        TCPConnection connection = new TCPConnection();
        //System.out.println(connection.getState().toString());
        connection.open();
        System.out.println(connection.getState().toString());
        connection.ackowledge();
        System.out.println(connection.getState().toString());
        connection.close();
        System.out.println(connection.getState().toString());
    }
}
