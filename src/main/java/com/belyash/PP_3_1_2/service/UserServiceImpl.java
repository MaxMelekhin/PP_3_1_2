package com.belyash.PP_3_1_2.service;

import com.belyash.PP_3_1_2.dao.UserDao;
import com.belyash.PP_3_1_2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User getUser(int id) {
        return userDao.getUser(id);
    }

    @Override
    public List<User> gelAllUsers() {
        return userDao.gelAllUsers();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    @Transactional
    public void update(User updateUser) {
        userDao.update(updateUser);
    }

    @Override
    @Transactional
    public void delete(int id) {
        userDao.delete(id);
    }
}
