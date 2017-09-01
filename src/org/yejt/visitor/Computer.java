package org.yejt.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yejt on 2017/9/1 0001.
 */
public class Computer implements ComputerPart
{

    private List<ComputerPart> list = new ArrayList<>();

    public void addComponent(ComputerPart part)
    {
        list.add(part);
    }

    public void removeComponent(ComputerPart part)
    {
        list.remove(part);
    }

    @Override
    public void accept(ComputerPartVisitor visitor)
    {
        visitor.visit(this);
        for(ComputerPart part : list)
            part.accept(visitor);
    }
}
