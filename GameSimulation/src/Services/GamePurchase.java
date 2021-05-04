package Services;
import Entities.Campaign;
import Entities.Gamer;
import Entities.Game;

public interface GamePurchase {
    void discountSale(Gamer gamer,Game game, Campaign campaign);
}
