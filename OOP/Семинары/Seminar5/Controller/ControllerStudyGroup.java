package Семинары.Seminar5.Controller;

import java.util.List;

import Семинары.Seminar5.Model.Student;
import Семинары.Seminar5.Model.StudyGroup;
import Семинары.Seminar5.Model.Teacher;
import Семинары.Seminar5.Service.StudyGroupService;

public class ControllerStudyGroup {
    StudyGroupService studyGroupService = new StudyGroupService();
    
    public void setStudyGroup(Teacher teacher, List<Student>  groupOfStudents){
        studyGroupService.setStudyGroup(teacher, groupOfStudents);
    
}
    public StudyGroup getStudyGroup(){
       return studyGroupService.getStudyGroup();

}

    public String getDisciple(Teacher teacher){
        return studyGroupService.getDisciple(teacher);
    }

    }

