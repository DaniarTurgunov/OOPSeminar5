package Seminar5.CW.View;

import Seminar5.CW.Model.User;
import Seminar5.CW.Service.UserService;
import Seminar5.CW.Service.UserServiceImpl;

public class UserView {
    private UserService userService = new UserServiceImpl();
    public void saveUser(String name, int age , float salary){
        userService.save(new User(name, age, salary));
    }
}
