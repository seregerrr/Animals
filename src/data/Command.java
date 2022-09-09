package data;

public enum Command {

    ADD,
    LIST,
    EXIT;

        static public Command commandIgnoreCase(String value) {
            for (Command command : Command.values()) {
                if ( command.name().equalsIgnoreCase(value) ) return command;
            }
            return null;
        }
}
