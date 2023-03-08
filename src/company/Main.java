package company;

import company.gender.Gender;
import company.model.MyException;
import company.model.User;
import company.service.impl.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Anna", 23, Gender.FEMALE);
        User user2 = new User(2, "Чынгыз", 35, Gender.MALE);
        User user3 = new User(3, "Мээрим", 29, Gender.FEMALE);

        UserServiceImpl userService = new UserServiceImpl();

        userService.addAUser(user1);
        userService.addAUser(user2);
        userService.addAUser(user3);

        try {
            System.out.println(userService.findById(1));
            userService.getAllUser();
            userService.deleteUserById(2);
            userService.getAllUser();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}