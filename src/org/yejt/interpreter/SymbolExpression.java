package org.yejt.interpreter;

import java.util.Map;

/**
 * Created by Yejt on 2017/8/28 0028.
 */
public abstract class SymbolExpression implements Expression
{
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right)
    {
        this.left = left;
        this.right = right;
    }

    public abstract int interpret(Map<String, Integer> context);

    public Expression getLeft()
    {
        return this.left;
    }

    public Expression getRight()
    {
        return this.right;
    }
}
