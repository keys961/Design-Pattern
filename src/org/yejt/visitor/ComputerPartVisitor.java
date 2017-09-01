package org.yejt.visitor;

/**
 * Created by Yejt on 2017/9/1 0001.
 */
public interface ComputerPartVisitor
{
    public void visit(Computer computer);

    public void visit(Mouse mouse);

    public void visit(Keyboard keyboard);

    public void visit(Monitor monitor);
}
