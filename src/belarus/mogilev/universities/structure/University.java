package belarus.mogilev.universities.structure;

import java.util.List;

public class University {

    private String nameOfUniversity;
    private List <Faculty> listOfFaculties;

    public University(String nameOfUniversity, List<Faculty> listOfFaculties) {
        this.nameOfUniversity = nameOfUniversity;
        this.listOfFaculties = listOfFaculties;
    }

    public String getNameOfUniversity() {
        return nameOfUniversity;
    }

    public void setNameOfUniversity(String nameOfUniversity) {
        this.nameOfUniversity = nameOfUniversity;
    }

    public List<Faculty> getListOfFaculties() {
        return listOfFaculties;
    }

    public void setListOfFaculties(List<Faculty> listOfFaculties) {
        this.listOfFaculties = listOfFaculties;
    }
}
