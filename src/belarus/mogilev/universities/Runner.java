package belarus.mogilev.universities;

import belarus.mogilev.universities.structure.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List <Subject> subj2 = Arrays.asList(new Subject(4,"PE"),new Subject(6,"TOE"));
        List <Subject> subjectList = Arrays.asList(
                new Subject(11,"Math"),
                new Subject(5, "Chemistry"),
                new Subject(9,"PE"),
                new Subject(8,"Russian language"));
        List<Student> studentList = Arrays.asList(
               new Student("Anatoliy",subjectList),
                new Student("Ivan", subj2));
        List <Group> groupList =new ArrayList<>();
        groupList.add(new Group("EAiTR-181",studentList));
        List<Faculty> facultyList = List.of(
                new Faculty("Engineering-Economical", groupList));
        University university = new University("BRU",facultyList);

    UniversityProcessor universityProcessor = new UniversityProcessor();
        System.out.println(universityProcessor.calculateAverageMarkOfStudent(studentList.get(0)));
       System.out.println(universityProcessor.calculateAverageMarkOfSpecificSubjectOfSpecificGroupOfSpecificFaculty(
                new Subject(7,"Math"),
               new Group("EAiTR-181",studentList),
                new Faculty("Engineering-Economical",groupList)));
        System.out.println(universityProcessor.getAverageMarkOfSubjectForUniversity(university,new Subject(3,"PE")));
    }
}
