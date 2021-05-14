package core;

import entities.concretes.User;
import googleLogin.GoogleLoginManager;

public class GoogleLoginAdapter implements LoginService{
    @Override
    public void login(User user) {
        GoogleLoginManager manager = new GoogleLoginManager();
        manager.login(user);
    }
}
