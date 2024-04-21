package Семинары.Seminar5.Service;



import java.util.ArrayList;
import java.util.List;

import Семинары.Seminar5.Model.Student;
import Семинары.Seminar5.Model.Teacher;
import Семинары.Seminar5.Model.User;


// Создать класс DataService с методами в по управлению сущностями User (create, read) 
// и агрегирующий всех пользователей заведенных в системе
// StudentId должны быть созданы по алгоритму – максимальный id в коллекции + 1. 
// Аналогично и для TeacherId. Здесь решение через перебор элементов и instanceOf

public class DataService {
    
    private List<User> student = new ArrayList<>();
    private List<User> teacher = new ArrayList<>();

    public void UserList(User user){
        if(user instanceof Student){
            student.add(user);
        } else if(user instanceof Teacher){
            teacher.add(user);
        }
    }

    public List<User> getUserList(String type){
        if(type.equals("student")){
            return student;
        }
        else if (type.equals("teacher")){
            return teacher;
        }
        return null;
}
}
