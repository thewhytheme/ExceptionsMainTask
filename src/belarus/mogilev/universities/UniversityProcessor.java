package belarus.mogilev.universities;

import belarus.mogilev.universities.exceptions.*;
import belarus.mogilev.universities.structure.*;

import java.util.Objects;

public class UniversityProcessor {

    public double calculateAverageMarkOfStudent (Student student) throws AbsenceOfStudentsSubjectsException, MarkBelowZeroOrAboveTenException {
          if (!(student.getStudentSubjectList()==null)){
              int averageMark=0;
              for (Subject s:student.getStudentSubjectList()) {
                  if (!(s.getMark()>10)|!(s.getMark()<0)){
                      averageMark+=s.getMark();
                  }else {
                      throw new MarkBelowZeroOrAboveTenException("Incorrect mark");
                  }

              }
              return (double) averageMark/(student.getStudentSubjectList().size());
          }else {
              throw new AbsenceOfStudentsSubjectsException("no subjects, or null");
          }
    }

    private boolean checkAbsence (Subject subject, Group group, Faculty faculty){
        if (subject==null|group==null|faculty==null){
            return false;
        }
        if (faculty.getListOfGroups()==null){
            throw new AbsenceOfGroupsInFacultyException("no groups in faculty");
        }
        if (group.getListOfStudents()==null){
            throw new AbsenceOfStudentsInGroupException("no students in group");
        }
        for (Student s: group.getListOfStudents()) {
            if(s.getStudentSubjectList()==null){
                throw new AbsenceOfStudentsSubjectsException("no subjects");
            }
        }
        return true;
    }

    public double calculateAverageMarkOfSpecificSubjectOfSpecificGroupOfSpecificFaculty (Subject subject, Group group, Faculty faculty)
            throws AbsenceOfGroupsInFacultyException, AbsenceOfStudentsInGroupException, AbsenceOfStudentsSubjectsException, MarkBelowZeroOrAboveTenException {
        int sumOfMarks=0;
        int countOfMarks=0;
        if(checkAbsence(subject,group,faculty)){
            for (Group gr: faculty.getListOfGroups()) {
                if (Objects.equals(group.getNameOfGroup(), gr.getNameOfGroup())){
                    for (Student s: group.getListOfStudents()) {
                        for (Subject subj: s.getStudentSubjectList()) {
                            if (Objects.equals(subj.getNameOfSubject(), subject.getNameOfSubject())){
                                if (!(subj.getMark()>10)|!(subj.getMark()<0)){
                                    sumOfMarks+=subj.getMark();
                                    countOfMarks++;
                                }else {
                                    throw new MarkBelowZeroOrAboveTenException("mark is wrong");
                                }
                            }
                        }
                    }
                }
            }
        }return (double) sumOfMarks/countOfMarks;
    }

    public double getAverageMarkOfSubjectForUniversity (University university, Subject subject) throws AbsenceOfStudentsSubjectsException,
            AbsenceOfStudentsInGroupException, AbsenceOfGroupsInFacultyException, AbsenceOfFacultiesInUniversityException, MarkBelowZeroOrAboveTenException{
        int sumOfMarks= 0;
        int countOfMarks=0;
        if (university!= null && subject != null){
            if (university.getListOfFaculties()!=null){
                for (Faculty f: university.getListOfFaculties()) {
                    if (f.getListOfGroups()!=null){
                        for (Group gr: f.getListOfGroups()) {
                            if (gr.getListOfStudents()!=null){
                                for (Student st: gr.getListOfStudents()) {
                                    if (st.getStudentSubjectList()!=null){
                                        for (Subject sub:st.getStudentSubjectList()) {
                                            if (sub.getNameOfSubject().equals(subject.getNameOfSubject())){
                                                if (sub.getMark()<11&&sub.getMark()>0){
                                                    sumOfMarks+=sub.getMark();
                                                    countOfMarks++;
                                                }else {
                                                    throw new MarkBelowZeroOrAboveTenException("wrong mark");
                                                }
                                            }
                                        }
                                    }else {
                                        throw new AbsenceOfStudentsSubjectsException("no subjects");
                                    }
                                }
                            }else{
                                throw new AbsenceOfStudentsInGroupException("no students");
                            }
                        }
                    }else {
                        throw new AbsenceOfGroupsInFacultyException("no groups");
                    }
                }
            }else {
                throw new AbsenceOfFacultiesInUniversityException("no faculties");
            }
        }else {
            System.out.println("incorrect input");
        }
        return (double) sumOfMarks/countOfMarks;
    }
}
