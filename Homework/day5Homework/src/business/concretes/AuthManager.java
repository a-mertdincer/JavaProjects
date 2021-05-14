package business.concretes;

import core.AuthService;
import entities.concretes.User;

public class AuthManager implements AuthService {

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
