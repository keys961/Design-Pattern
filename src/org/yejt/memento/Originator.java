package org.yejt.memento;

/**
 * Created by Yejt on 2017/8/29 0029.
 */
public class Originator
{
    private String state;

    public void setState(String state)
    {
        this.state = state;
    }

    public String getState()
    {
        return this.state;
    }

    public Memento saveStateToMemento()
    {
        return new Memento(state);
    }

    public void recoverStateFromMemento(Memento memento)
    {
        state = memento.getState();
    }
}
