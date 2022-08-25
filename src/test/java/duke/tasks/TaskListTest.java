package duke.tasks;

import duke.exceptions.DukeException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskListTest {

    @Test
    public void addTodoTest() {
        TaskList tasks = new TaskList();
        assertEquals(tasks.toString(), "");
        tasks.addTask(new ToDo("Return book"));
        assertEquals(tasks.toString(), "1.[T][✘] Return book");
    }

    @Test
    public void deleteTask() throws DukeException {
        TaskList tasks = new TaskList();
        assertEquals(tasks.toString(), "");
        tasks.addTask(new ToDo("Return book"));
        assertEquals(tasks.toString(), "1.[T][✘] Return book");
        tasks.delete("1");
        assertEquals(tasks.toString(), "");
    }
}
