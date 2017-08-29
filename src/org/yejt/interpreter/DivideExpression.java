package org.yejt.interpreter;

import java.util.Map;

/**
 * Created by Yejt on 2017/8/29 0029.
 */
public class DivideExpression extends SymbolExpression
{
    public DivideExpression(Expression left, Expression right)
    {
        super(left, right);
    }

    @Override
    public int interpret(Map<String, Integer> context)
    {
        int result = 0;
        try
        {
            result = left.interpret(context) / right.interpret(context);
        }
        catch (Exception e)
        {
            System.out.println(e.getCause().toString());
        }
        return result;
    }
}
