package org.yejt.command;

/**
 * Created by Yejt on 2017/8/28 0028.
 */
public class PasteCommand implements Command
{
    private Document document;

    public PasteCommand(Document document)
    {
        this.document = document;
    }

    @Override
    public void execute()
    {
        if(document != null)
            document.paste();
    }
}
