package com.kidek.crud.service;

import com.kidek.crud.model.User;
import com.kidek.crud.repository.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDAO userDao;


    @Transactional
    public void add(User user) {
        userDao.save(user);
    }


    public User getById(Long id) {
        return userDao.getOne(id);
    }


    public List<User> getAllUsers() {
        return userDao.findAll();
    }


    @Transactional
    public void remove(Long id) {
        userDao.deleteById(id);
    }


    @Transactional
    public void edit(User user) {
        userDao.save(user);
    }
}
