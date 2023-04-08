package com.belyash.PP_3_1_2.dao;



import com.belyash.PP_3_1_2.model.User;

import java.util.List;

public interface UserDao {
    List<User> gelAllUsers();

    void saveUser(User user);

    User getUser(int id);

    void update(User updateUser);

    void delete(int id);
}
