package belarus.mogilev.universities.structure;

import java.util.List;

public class Group  {

    private String nameOfGroup;
    private List <Student> listOfStudents;

    public Group(String nameOfGroup, List<Student> listOfStudents) {
        this.nameOfGroup = nameOfGroup;
        this.listOfStudents = listOfStudents;
    }

    public String getNameOfGroup() {
        return nameOfGroup;
    }

    public void setNameOfGroup(String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
    }

    public List<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(List<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }
}
