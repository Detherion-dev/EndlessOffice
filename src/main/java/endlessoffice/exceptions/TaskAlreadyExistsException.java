package endlessoffice.exceptions;

import java.io.Serializable;

public class TaskAlreadyExistsException extends Exception implements Serializable {
    private static final long serialVersionUID = -3316059992395377104L;

    public TaskAlreadyExistsException()
    {
        super();
    }

    public TaskAlreadyExistsException(String message) {
        super(message);
    }
}
