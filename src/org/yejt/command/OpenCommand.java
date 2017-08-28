package org.yejt.command;

import java.util.Scanner;

/**
 * Created by Yejt on 2017/8/28 0028.
 */
public class OpenCommand implements Command
{
    private Application application; //Invoker
    private String response;

    protected String askUser()
    {
        System.out.println("Please input your file name:");
        Scanner in = new Scanner(System.in);
        return in.next();
    }

    public OpenCommand(Application a)
    {
        this.application = a;
    }

    @Override
    public void execute()
    {
        String name = askUser();
        if(name != null)
        {
            Document doc = new Document(name);
            application.addDocument(doc);
            doc.open();
        }
    }
}
