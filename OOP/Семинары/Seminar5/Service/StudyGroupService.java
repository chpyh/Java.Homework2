package Семинары.Seminar5.Service;


import java.util.List;
import Семинары.Seminar5.Model.Student;
import Семинары.Seminar5.Model.StudyGroup;
import Семинары.Seminar5.Model.Teacher;

// * Создать класс УчебнаяГруппаСервис, в котором реализована функция (входные параметры - (Teacher, List<Student>))
//  формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его;

public class StudyGroupService {

    StudyGroup studyGroup; 

    public void setStudyGroup(Teacher teacher, List<Student> groupOfStudents){
        studyGroup = new StudyGroup(teacher, groupOfStudents);

    }

    public StudyGroup getStudyGroup(){
        return studyGroup;

    }
    public String getDisciple(Teacher teacher){
        return teacher.getDisciplesTaught();
    }

}
