package Seminar5.CW1.view;

import Seminar5.CW1.model.User;
import Seminar5.CW1.service.UserService;
import Seminar5.CW1.service.UserServiceImpl;

public class UserView {
    private UserService userService = new UserServiceImpl();
    public void saveUser(String name, int age , float salary){
        userService.save(new User(name));
    }
    public void creditPrint(User user, int creditSum){
        System.out.println(userService.credit(user,creditSum));
    }
}
