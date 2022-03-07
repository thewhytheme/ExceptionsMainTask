package belarus.mogilev.universities.structure;

import java.util.List;

public class Faculty {

    private String nameOfFaculty;
    private List <Group> listOfGroups;

    public Faculty(String nameOfFaculty, List<Group> listOfGroups) {
        this.nameOfFaculty = nameOfFaculty;
        this.listOfGroups = listOfGroups;
    }

    public String getNameOfFaculty() {
        return nameOfFaculty;
    }

    public void setNameOfFaculty(String nameOfFaculty) {
        this.nameOfFaculty = nameOfFaculty;
    }

    public List<Group> getListOfGroups() {
        return listOfGroups;
    }

    public void setListOfGroups(List<Group> listOfGroups) {
        this.listOfGroups = listOfGroups;
    }
}
