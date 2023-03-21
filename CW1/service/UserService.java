package Seminar5.CW1.service;

import Seminar5.CW1.model.User;

public interface UserService {
     void save(User user);
     boolean credit(User user, int creditSum);
}
