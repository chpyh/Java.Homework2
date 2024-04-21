package Семинары.Seminar5.View;

import java.util.List;

import Семинары.Seminar5.Controller.ControllerStudyGroup;
import Семинары.Seminar5.Model.Student;
import Семинары.Seminar5.Model.Teacher;

public class StudyGroupView {
    private ControllerStudyGroup controller = new ControllerStudyGroup();

    public void setStudyGroup(Teacher teacher, List<Student> groupOfStudents) {
        controller.setStudyGroup(teacher, groupOfStudents);

    }

    // public void setStudentsList(Student student){
    //     controller.setStudentsList(student);
    // }

    // public List<Student> getStudentsList() {
    //     return controller.getStudentsList();


    public void printDiscipleGroup(Teacher teacher, List<Student> groupOfStudents) {
        String disciple = controller.getDisciple(teacher);
        System.out.println("Предмет: '" + disciple + "'. Список студентов: " + groupOfStudents);
    }
    
    public void printStudyGroup(){
        System.out.println("Новая группа {\n" + controller.getStudyGroup() + " }");
    }



}
