package org.yejt.command;

/**
 * Created by Yejt on 2017/8/28 0028.
 */
public class Document
{
    private String content;

    private String name;

    private boolean isOpened = false;

    public Document(String name)
    {
        this.name = name;
    }

    public void addContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return this.content;
    }

    public void open()
    {
        if(!isOpened)
        {
            isOpened = true;
        }
        System.out.println("Document " + this.name + " is opened.");
    }

    public void close()
    {
        if(isOpened)
        {
            isOpened = false;
        }
        System.out.println("Document " + this.name + " is closed.");
    }

    public void paste()
    {
        System.out.println("Document " + this.name + " has been pasted.");
    }
}
