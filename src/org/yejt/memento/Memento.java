package org.yejt.memento;

/**
 * Created by Yejt on 2017/8/29 0029.
 */
public class Memento
{
    private String state;

    public Memento(String state)
    {
        this.state = state;
    }

    public String getState()
    {
        return this.state;
    }
}
