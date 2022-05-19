package endlessoffice.exceptions;

public class NotEnoughSpaceException extends Exception {

    public NotEnoughSpaceException() {

    }

    public NotEnoughSpaceException(String message) {
        super(message);
    }
}
