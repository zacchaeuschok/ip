package duke.tasks;

import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;

import duke.parser.TimeParser;

/**
 * Represents deadline task with specified deadline.
 */
public class Deadline extends Task {

    private static final TimeParser TIME_PARSER = new TimeParser();
    protected LocalDateTime deadline;

    /**
     * Constructor specifying description and deadline of a deadline task.
     *
     * @param description the description of deadline task
     * @param deadline the deadline of deadline task
     */
    public Deadline(String description, String deadline) {
        super(description);
        this.deadline = TIME_PARSER.createDeadline(deadline);
    }

    /**
     * Checks if deadline task is before given deadline
     *
     * @param deadline the specified deadline to check for
     * @return true if task is before specified deadline; false otherwise
     * @throws DateTimeParseException if specified deadline does not follow d/mm/YYYY format
     */
    @Override
    public boolean isBefore(String deadline) throws DateTimeParseException {
        LocalDateTime before = TIME_PARSER.createDeadline(deadline);
        return this.deadline.isBefore(before);
    }

    /**
     * Returns string representation of deadline task.
     *
     * @return string representation of deadline task
     */
    @Override
    public String toString() {
        return String.format("[D]%s (by: %s)", super.toString(), TIME_PARSER.formatDeadline(this.deadline));
    }
}
