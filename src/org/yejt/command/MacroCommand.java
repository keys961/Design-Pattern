package org.yejt.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yejt on 2017/8/28 0028.
 */
public class MacroCommand implements Command
{
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command)
    {
        commands.add(command);
    }

    public void removeCommand(Command command)
    {
        commands.remove(command);
    }

    @Override
    public void execute()
    {
        for(Command command : commands)
            command.execute();
    }
}
