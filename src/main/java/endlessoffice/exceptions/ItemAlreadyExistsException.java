package endlessoffice.exceptions;

public class ItemAlreadyExistsException extends Exception {

    public ItemAlreadyExistsException() {    }

    public ItemAlreadyExistsException(String message) {
        super(message);
    }

}
