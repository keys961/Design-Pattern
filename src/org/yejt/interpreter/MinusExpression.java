package org.yejt.interpreter;

import java.util.Map;

/**
 * Created by Yejt on 2017/8/28 0028.
 */
public class MinusExpression extends SymbolExpression
{
    public MinusExpression(Expression left, Expression right)
    {
        super(left, right);
    }

    @Override
    public int interpret(Map<String, Integer> context)
    {
        return left.interpret(context) - right.interpret(context);
    }
}
