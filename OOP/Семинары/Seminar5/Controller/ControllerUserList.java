package Семинары.Seminar5.Controller;

// 1. Создать package – controller. Работу продолжаем в нем
// 2. Создать класс Controller агрегирующий в себе необходимые классы в виде полей, а инициализируем прям в поле.
import java.util.List;

import Семинары.Seminar5.Model.User;
import Семинары.Seminar5.Service.DataService;

public class ControllerUserList {
    
    DataService service = new DataService();


    public void UserList(User user){
        service.UserList(user);
        
    }

    public List<User> getUserList(String type){
        return service.getUserList(type);
    }
}
