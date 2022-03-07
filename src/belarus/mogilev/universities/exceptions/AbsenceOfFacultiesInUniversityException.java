package belarus.mogilev.universities.exceptions;

public class AbsenceOfFacultiesInUniversityException extends RuntimeException{

    public AbsenceOfFacultiesInUniversityException() {
    }

    public AbsenceOfFacultiesInUniversityException(String message) {
        super(message);
    }

    public AbsenceOfFacultiesInUniversityException(String message, Throwable cause) {
        super(message, cause);
    }

    public AbsenceOfFacultiesInUniversityException(Throwable cause) {
        super(cause);
    }
}
