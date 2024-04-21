package Семинары.Seminar5;

import java.util.ArrayList;
import java.util.List;

import Семинары.Seminar5.Model.Student;
import Семинары.Seminar5.Model.StudyGroup;
//import Семинары.Seminar5.Model.StudyGroup;
import Семинары.Seminar5.Model.Teacher;
// import Семинары.Seminar5.Model.User;
// import Семинары.Seminar5.View.StudentView;
import Семинары.Seminar5.View.StudyGroupView;



public class Main {
    public static void main(String[] args) {
    

    Teacher teacher = new Teacher("Шольц Эсмеральда Генриховна", 45, "Палеонтология");

    Student student = new Student("Иванов Иван", 19, 123);
    Student student1 = new Student("Петров Максим", 19, 124);
    Student student2= new Student("Легкова Марина", 21, 125);
    Student student3 = new Student("Пряничникова Маша", 20, 126);

    StudyGroup studyGroup = new StudyGroup();
    studyGroup.setStudentsList(student);
    studyGroup.setStudentsList(student1);
    studyGroup.setStudentsList(student2);
    studyGroup.setStudentsList(student3);

    List <Student> studentList = new ArrayList<>(studyGroup.getStudentsList());
    StudyGroupView studyGroupView= new StudyGroupView();
    
    studyGroupView.setStudyGroup(teacher, studentList);
    studyGroupView.printStudyGroup();
    System.out.println();
    studyGroupView.printDiscipleGroup(teacher, studentList);
 

    //работа на семинаре
    // User student = new Student("Иванов Иван", 19, 123);
    // User student1 = new Student("Петров Максим", 19, 124);
    // User student2= new Student("Легкова Марина", 21, 125);
    // User student3 = new Student("Пряничникова Маша", 20, 126);

    // StudentView studentView = new StudentView();
    // studentView.UserList(student);
    // studentView.UserList(student1);
    // studentView.UserList(student2);
    // studentView.UserList(student3);

    // System.out.println(studentView.getUserList());
}
}