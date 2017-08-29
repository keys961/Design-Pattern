package org.yejt.interpreter;

import java.util.Map;

/**
 * Created by Yejt on 2017/8/28 0028.
 */
public class VarExpression implements Expression //Terminal
{
    private String key;

    public VarExpression(String key)
    {
        this.key = key;
    }

    @Override
    public int interpret(Map<String, Integer> context)
    {
        return context.get(key);
    }
}
