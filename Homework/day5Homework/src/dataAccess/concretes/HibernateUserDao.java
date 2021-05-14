package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {


    @Override
    public void register(User user) {

    }

    @Override
    public void remove(User user) {



    }

    @Override
    public boolean check(User user) {
        return false;
    }

    @Override
    public void login(User user) {

    }
}
