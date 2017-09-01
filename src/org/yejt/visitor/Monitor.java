package org.yejt.visitor;

/**
 * Created by Yejt on 2017/9/1 0001.
 */
public class Monitor implements ComputerPart
{
    @Override
    public void accept(ComputerPartVisitor visitor)
    {
        visitor.visit(this);
    }
}
