package org.yejt.command;

/**
 * Created by Yejt on 2017/8/28 0028.
 */
public class Main
{
    public static Command getCommand(Application a)
    {
        MacroCommand commands = new MacroCommand();
        commands.addCommand(new OpenCommand(a));
        commands.addCommand(new OpenCommand(a));
        commands.addCommand(new PasteCommand(new Document("Doc1.txt")));
        return commands;
    }

    public static void main(String[] args)
    {
        Application application = new Application();
        Command command = getCommand(application);
        command.execute();
    }
}
