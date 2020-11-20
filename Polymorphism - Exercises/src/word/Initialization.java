package word;

import java.util.List;

public class Initialization {
    public static CommandInterface buildCommandInterface(StringBuilder text) {
        return new CommandImpl(text) {
            @Override
            protected List<Command> initCommands() {
                return super.initCommands();
            }
        };
    }
}


