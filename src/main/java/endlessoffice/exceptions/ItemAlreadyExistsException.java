package endlessoffice.exceptions;

import java.io.Serializable;

public class ItemAlreadyExistsException extends Exception implements Serializable {

    private static final long serialVersionUID = -2720895319614427385L;

    public ItemAlreadyExistsException()
    {
        super();
    }

    public ItemAlreadyExistsException(String message) {
        super(message);
    }

}
