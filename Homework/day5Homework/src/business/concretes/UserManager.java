package business.concretes;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import business.abstracts.UserService;
import core.AuthService;
import core.LoginService;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class UserManager implements UserService, AuthService {

private UserDao userDao;
private LoginService loginService;

    public UserManager(UserDao userDao, LoginService loginService) {
        this.userDao = userDao;
        this.loginService = loginService;
    }

    public UserManager(HibernateUserDao userDao) {
    }

    @Override
    public void register(User user) {
        if (check(user)){
            verificationEmailSent(user.getFirstName());
            verificationEmailCheck(user);
        }
        else{
            System.out.println("Kayit basarisiz");
        }
    }

    @Override
    public void remove(User user) {
        System.out.println("Kullanici sistemden silindi");
    }

    @Override
    public boolean check(User user) {

        Pattern pattern = Pattern.compile("@");
        Matcher matcher = pattern.matcher(user.getEmail());

        if (!matcher.find()){
            System.out.println("Yanlis e mail.");
            return false;
        }

        else if (user.getPassword().length()<=5){
            System.out.println("Parolaniz 6 karakterden uzun olmalidir");
            return false;
        }
        else if(user.getFirstName().length()<2){
            System.out.println("Isminiz 2 karakterden uzun olmalidir");
            return false;
        }
        else if(user.getLastName().length()<2){
            System.out.println("Soy isminiz 2 karakterden uzun olmalidir");
            return false;
        }

        else{
            System.out.println("Kaydi tamamlamak icin mail adresinize gelen dogrulama baglantisina tiklayiniz.");
            return true;
        }

    }




    @Override
    public void verificationEmailSent(String report) {
        System.out.println("Dogrulama maili gonderildi " + report);
    }

    @Override
    public boolean verificationEmailCheck(User user) {
        if (user.isEmailVerificationCheck()){
            System.out.println("Dogrulama tamamlandi. Kayit basarili");
            return true;
        }
        return false;
    }
}
