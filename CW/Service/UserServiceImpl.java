package Seminar5.CW.Service;

import Seminar5.CW.Model.User;

import java.io.FileWriter;

public class UserServiceImpl implements UserService {
    @Override
    public void save(User user) {
        try(FileWriter fileWriter = new FileWriter("users.txt")){
            fileWriter.write(user.toString());
        }catch (Exception e){
            System.out.println("error during saving a user");
            e.printStackTrace();
        }
    }
}
