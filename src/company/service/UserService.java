package company.service;

import company.model.User;

public interface UserService {
    void addAUser(User user);

    User findById(int id);

    void deleteUserById(int id);

    void getAllUser();

}
