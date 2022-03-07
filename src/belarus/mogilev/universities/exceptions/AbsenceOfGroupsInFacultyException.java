package belarus.mogilev.universities.exceptions;

public class AbsenceOfGroupsInFacultyException extends RuntimeException{

    public AbsenceOfGroupsInFacultyException() {
    }

    public AbsenceOfGroupsInFacultyException(String message) {
        super(message);
    }

    public AbsenceOfGroupsInFacultyException(String message, Throwable cause) {
        super(message, cause);
    }

    public AbsenceOfGroupsInFacultyException(Throwable cause) {
        super(cause);
    }
}
