package belarus.mogilev.universities.exceptions;

public class MarkBelowZeroOrAboveTenException extends RuntimeException{

    public MarkBelowZeroOrAboveTenException() {
    }

    public MarkBelowZeroOrAboveTenException(String message) {
        super(message);
    }

    public MarkBelowZeroOrAboveTenException(String message, Throwable cause) {
        super(message, cause);
    }

    public MarkBelowZeroOrAboveTenException(Throwable cause) {
        super(cause);
    }
}
