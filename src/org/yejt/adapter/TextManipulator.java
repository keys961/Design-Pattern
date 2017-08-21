package org.yejt.adapter;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Yejt on 2017/8/21 0021.
 */
public class TextManipulator implements Manipulator
{
    private TextShape textShape;

    public TextManipulator(TextShape textShape)
    {
        this.textShape = textShape;
    }


    @Override
    public void maniplate()
    {
        Member[] members = (textShape.getClass().getDeclaredMethods());
        Member[] innerManners = (textShape.getTextView().getClass().getDeclaredMethods());
        for(Member member : members)
            System.out.println(member);
        for(Member member : innerManners)
            System.out.println(member);
    }
}
