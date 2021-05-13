import java.time.LocalDate;

import abstracts.GamerCheckService;
import adapters.MernisAdapter;
import concretes.PlayerCheckService;
import concretes.PlayerManager;
import entities.Game;
import entities.Player;

public class Main {

    public static void main(String[] args) {
        PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
        playerManager.register(new Player("Engin","Demiroð",28861499108L,LocalDate.of(1985,6,1)));

        System.out.println("\n----\n");

        PlayerManager playerManager2 = new PlayerManager(new MernisServiceAdapter());
        playerManager2.register(new Player("Engin","Demiroð",28861499108L,LocalDate.of(1987,6,1)));

        System.out.println("\n----\n");

        PlayerManager playerManager3 = new PlayerManager(new MernisServiceAdapter());
        playerManager3.register(new Player("Engin","Demiroð",28861499108L,LocalDate.of(1985,6,1)));

    }

}