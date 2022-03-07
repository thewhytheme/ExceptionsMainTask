package belarus.mogilev.universities.structure;

public class Subject {

    private Integer mark;
    private String nameOfSubject;

    public Subject(Integer mark, String nameOfSubject) {
        this.mark = mark;
        this.nameOfSubject = nameOfSubject;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public String getNameOfSubject() {
        return nameOfSubject;
    }

    public void setNameOfSubject(String nameOfSubject) {
        this.nameOfSubject = nameOfSubject;
    }
}
