package concretes;
import abstracts.GamerCheckService;
import entities.Player;

public class PlayerCheckService {


    public class PlayerCheckService implements GamerCheckService {

        @Override
        public boolean checkIfRealPerson(Player player) {
            System.out.println(player.getFirstName() + " GamerCheckManager ile sisteme kaydedildi!");
            return true;
        }
    }
}