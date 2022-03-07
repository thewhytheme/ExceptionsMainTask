package belarus.mogilev.universities.structure;

import java.util.List;

public class Student {

    private String nameOfStudent;
    private List <Subject> studentSubjectList;

    public Student(String nameOfStudent, List<Subject> studentSubjectList) {
        this.nameOfStudent = nameOfStudent;
        this.studentSubjectList = studentSubjectList;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public List<Subject> getStudentSubjectList() {
        return studentSubjectList;
    }

    public void setStudentSubjectList(List<Subject> studentSubjectList) {
        this.studentSubjectList = studentSubjectList;
    }
}
