package belarus.mogilev.universities.exceptions;

public class AbsenceOfStudentsInGroupException extends RuntimeException{

    public AbsenceOfStudentsInGroupException() {
    }

    public AbsenceOfStudentsInGroupException(String message) {
        super(message);
    }

    public AbsenceOfStudentsInGroupException(String message, Throwable cause) {
        super(message, cause);
    }

    public AbsenceOfStudentsInGroupException(Throwable cause) {
        super(cause);
    }
}
