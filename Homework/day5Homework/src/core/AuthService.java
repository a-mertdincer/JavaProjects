package core;

import entities.concretes.User;

public interface AuthService {
    void verificationEmailSent(String report);
    boolean verificationEmailCheck(User user);
}
