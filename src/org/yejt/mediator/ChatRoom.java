package org.yejt.mediator;

import java.util.Date;

/**
 * Created by Yejt on 2017/8/29 0029.
 * Mediator
 */
public class ChatRoom
{
    public static void showMessage(User user, String message)
    {
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
