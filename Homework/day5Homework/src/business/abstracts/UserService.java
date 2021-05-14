package business.abstracts;

import entities.concretes.User;

public interface UserService {

    void register(User user);
    void remove(User user);
    boolean check(User user);


}
