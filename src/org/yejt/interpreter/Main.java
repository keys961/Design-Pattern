package org.yejt.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yejt on 2017/8/29 0029.
 */
public class Main
{
    public static void main(String[] args)
    {
        Interpreter interpreter = new Interpreter("ass+bee/cheat+doc");
        Map<String, Integer> map = new HashMap<>();
        map.put("ass", 2);
        map.put("bee", 9);
        map.put("cheat", 3);
        map.put("doc", 5);

        System.out.println(interpreter.run(map));
    }
}
