package org.entropy;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void revoke(Command command) {
        commands.remove(command);
    }

    public void click() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
