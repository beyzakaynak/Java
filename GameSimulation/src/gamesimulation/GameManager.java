package gamesimulation;
import Services.GameServices;
import Entities.Game;

public class GameManager extends Game implements GameServices {


    @Override
    public void save(Game game) {
        System.out.println("Oyun eklendi: " + game.getGameName());
    }

    @Override
    public void delete(Game game) {
        System.out.println("Oyun silindi: " + game.getGameName());
    }

    @Override
    public void update(Game game) {
        System.out.println("Oyun güncellendi: " + game.getGameName());
    }
}
