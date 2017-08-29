package org.yejt.interpreter;

import java.util.Map;

/**
 * Created by Yejt on 2017/8/28 0028.
 */
public interface Expression
{
    public int interpret(Map<String, Integer> context);
    //Store leaf value in the map when building a expression tree
}
