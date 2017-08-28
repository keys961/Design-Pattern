package org.yejt.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yejt on 2017/8/28 0028.
 */
public class Application
{
    private List<Document> documentList = new ArrayList<>();

    public void addDocument(Document document)
    {
        documentList.add(document);
    }

    public void closeDocument(Document document)
    {
        documentList.remove(document);
    }
}
