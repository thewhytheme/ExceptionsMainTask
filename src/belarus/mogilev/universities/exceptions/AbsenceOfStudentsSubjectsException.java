package belarus.mogilev.universities.exceptions;

public class AbsenceOfStudentsSubjectsException extends RuntimeException{

    public AbsenceOfStudentsSubjectsException() {
    }

    public AbsenceOfStudentsSubjectsException(String message) {
        super(message);
    }

    public AbsenceOfStudentsSubjectsException(String message, Throwable cause) {
        super(message, cause);
    }

    public AbsenceOfStudentsSubjectsException(Throwable cause) {
        super(cause);
    }
}
