import business.abstracts.UserService;
import business.concretes.UserManager;
import core.GoogleLoginAdapter;
import core.LoginService;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;
import googleLogin.GoogleLoginManager;

public class Main {

    public static void main(String[] args) {

        UserService userService = new UserManager(new HibernateUserDao());
        User user = new User();
        user.setEmail("a.mertdincer@yandex.com");
        user.setFirstName("Ahmet Mert");
        user.setLastName("Dincer");
        user.setPassword("9asdaasdasd");
        user.setEmailVerificationCheck(true);
        userService.register(user);
        LoginService googleLoginManager= new GoogleLoginAdapter();
        //googleLoginManager.login(user);


    }
}
