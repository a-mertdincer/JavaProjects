package concretes;
import abstracts.GamerCheckService;
import abstracts.GamerService;
import entities.Player;

public class PlayerManager {



    public class GamerManager implements GamerService{

        private GamerCheckService gamerCheckService;

        public GamerManager(GamerCheckService gamerCheckService) {
            super();
            this.gamerCheckService = gamerCheckService;
        }

        @Override
        public void register(Player player) {
            if(gamerCheckService.checkIfRealPerson(gamer)==true)
                System.out.println(player.getFirstName() + " sisteme baþarýyla kaydedildi!");
            else
                System.out.println(player.getFirstName() + " sisteme kayýt olamadý!");

        }

        @Override
        public void delete(Player player) {
            System.out.println(player.getFirstName() + " sistemden baþarýyla silindi!");

        }

        @Override
        public void update(Player player) {
            System.out.println(player.getFirstName() + " baþarýyla güncellendi!");


        }

}
