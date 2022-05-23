package endlessoffice.exceptions;

public class TaskAlreadyExistsException extends Exception{
    public TaskAlreadyExistsException() {

    }

    public TaskAlreadyExistsException(String message) {
        super(message);
    }
}
