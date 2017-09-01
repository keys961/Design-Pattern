package org.yejt.visitor;

/**
 * Created by Yejt on 2017/9/1 0001.
 */
public interface ComputerPart
{
    public void accept(ComputerPartVisitor visitor);
}
