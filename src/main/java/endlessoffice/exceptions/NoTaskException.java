package endlessoffice.exceptions;

import java.io.Serializable;

public class NoTaskException extends Exception implements Serializable {
    private static final long serialVersionUID = 3200505234539706550L;

    public NoTaskException()
    {
        super();
    }

    public NoTaskException(String message) {
        super(message);
    }
}
