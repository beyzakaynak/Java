package Services;
import Entities.Game;

public interface GameServices {
    void save(Game game);
    void delete(Game game);
    void update(Game game);

}