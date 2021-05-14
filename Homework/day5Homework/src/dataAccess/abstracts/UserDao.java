package dataAccess.abstracts;

import entities.concretes.User;

public interface UserDao {

    void register(User user);
    void remove(User user);
    boolean check(User user);
    void login(User user);
}
