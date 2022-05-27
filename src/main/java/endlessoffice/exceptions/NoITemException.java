package endlessoffice.exceptions;

import java.io.Serializable;

public class NoITemException extends Exception implements Serializable {

    private static final long serialVersionUID = 9020496128553774627L;

    public NoITemException()
    {
        super();
    }

    public NoITemException(String message) {
        super(message);
    }
}
