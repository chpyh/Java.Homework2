package Семинары.Seminar5.View;

import java.util.List;

import Семинары.Seminar5.Controller.ControllerUserList;
import Семинары.Seminar5.Model.User;

// Создать package – view. Работу продолжаем в нем
//2. Создать класс StudentView, содержащий в себе метод вывода в консоль данных студента поданных на вход

public class StudentView {
    private ControllerUserList controller = new ControllerUserList();

    public void UserList(User user){
        controller.UserList(user);
        System.out.println("Студент " + user + "добавлен");
        
    }

    public List<User> getUserList(){
        return controller.getUserList("student");
        
    }
    
}
    

