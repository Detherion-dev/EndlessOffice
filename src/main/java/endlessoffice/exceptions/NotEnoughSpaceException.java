package endlessoffice.exceptions;

import java.io.Serializable;

public class NotEnoughSpaceException extends Exception implements Serializable {

    private static final long serialVersionUID = 2152831931519452194L;

    public NotEnoughSpaceException()
    {
        super();
    }

    public NotEnoughSpaceException(String message) {
        super(message);
    }
}
