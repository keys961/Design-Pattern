package org.yejt.adapter;

/**
 * Created by Yejt on 2017/8/21 0021.
 */
public class TextView
{
    private String text;

    public String getText()
    {
        return this.text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public void appendText(String text)
    {
        this.text += text;
    }

}
