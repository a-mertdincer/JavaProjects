package com.amd.hrms.business.abstracts;

import com.amd.hrms.entities.concretes.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> getAll();
}