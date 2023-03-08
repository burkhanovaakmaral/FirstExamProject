package company.service.impl;

import company.dao.UserDao;
import company.model.MyException;
import company.model.User;
import company.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDao();

    @Override
    public void addAUser(User user) {
        userDao.getUsers().add(user);
    }

    @Override
    public User findById(int id) {

        for (User i : userDao.getUsers()) {
            if (i.getId() == id) {
                return i;
            }

        }
        throw new MyException("Have not user with id: " + id);
    }

    @Override
    public void deleteUserById(int id) {
        for (User i : userDao.getUsers()) {
            if (i.getId() == id) {
                userDao.getUsers().remove(i);
            }

        }
    }

    @Override
    public void getAllUser() {
        for (User user : userDao.getUsers()) {
            System.out.println(user);
        }
    }

    @Override
    public String toString() {
        return "UserServiceImpl " +
                "userDao: " + userDao;
    }
}

