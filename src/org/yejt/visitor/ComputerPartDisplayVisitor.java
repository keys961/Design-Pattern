package org.yejt.visitor;

/**
 * Created by Yejt on 2017/9/1 0001.
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor
{
    @Override
    public void visit(Computer computer)
    {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse)
    {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard)
    {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor)
    {
        System.out.println("Displaying Monitor.");
    }
}
