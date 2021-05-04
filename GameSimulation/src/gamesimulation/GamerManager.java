package gamesimulation;
import Services.GamerServices;
import Entities.Gamer;
import Services.CheckTheGamer;

public class GamerManager implements GamerServices {

    public GamerManager(){

    }

    CheckTheGamer checkTheGamer;
    public GamerManager(CheckTheGamer checkTheGamer) {
        this.checkTheGamer = checkTheGamer;
    }

    @Override
    public void save(Gamer gamer) {
        System.out.println("Sisteme kaydınız doğrulanıyor: " + gamer.getFirstName()+gamer.getLastName());

    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println(gamer.getFirstName()+gamer.getLastName()+"Oyuncu sistemden silindi");
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println("Oyuncu Bilgileri Güncellendi : " +gamer.getFirstName()+gamer.getLastName() );
        System.out.println("-------------------------------");
    }
}
