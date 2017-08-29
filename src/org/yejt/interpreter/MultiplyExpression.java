package org.yejt.interpreter;

import java.util.Map;

/**
 * Created by Yejt on 2017/8/29 0029.
 */
public class MultiplyExpression extends SymbolExpression
{
    public MultiplyExpression(Expression left, Expression right)
    {
        super(left, right);
    }

    @Override
    public int interpret(Map<String, Integer> context)
    {
        return left.interpret(context) * right.interpret(context);
    }
}
