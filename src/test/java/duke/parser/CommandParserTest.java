package duke.parser;

import duke.tasks.TaskList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommandParserTest {

    @Test
    public void parseInvalidCommand(){
        CommandParser COMMAND_PARSER = new CommandParser(new TaskList());
    }

}
