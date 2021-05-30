package com.amd.hrms.business.concretes;

import com.amd.hrms.business.abstracts.UserService;
import com.amd.hrms.dataAccess.abstracts.UserDao;
import com.amd.hrms.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {

    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        this.userDao.save(user);
    }

    @Override
    public List<User> getAll() {
        return this.userDao.findAll();
    }
}