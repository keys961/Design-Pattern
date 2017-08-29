package org.yejt.mediator;

/**
 * Created by Yejt on 2017/8/29 0029.
 */
public class User
{
    private String name;

    public String getName()
    {
        return this.name;
    }

    public User(String name)
    {
        this.name = name;
    }

    public void sendMessage(String message)
    {
        ChatRoom.showMessage(this, message);
    }
}
