package Семинары.Seminar5.Model;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup{
    private Teacher teacher;
    private List<Student> groupOfStudents = new ArrayList<>();

    public StudyGroup(Teacher teacher,  List<Student> groupOfStudents){
        this.teacher = teacher;
        this.groupOfStudents = groupOfStudents;
    }


    public StudyGroup(){
        
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public void setStudentsList(Student student){
        groupOfStudents.add(student);

    }

    public List<Student> getStudentsList(){
        return groupOfStudents;
    }

    @Override
    public String toString() {
        return teacher + "\ncписок студентов:" + groupOfStudents;


    }
}