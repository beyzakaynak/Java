package gamesimulation;
import Entities.Campaign;
import Entities.Gamer;
import Entities.Game;
import Services.GamePurchase;

public class PurchaseManager implements GamePurchase {

    @Override
    public void discountSale(Gamer gamer, Game game, Campaign campaign) {
        System.out.println("Sevgili kullanıcımız " + gamer.getFirstName()+gamer.getLastName()+" "+" "+ game.getGameName()+
                " oyununu "+ campaign.getCampaignName() + "%"+ campaign.getDiscount() + " indirimi ile " + game.getGamePrice()+" TL yerine "+
                (game.getGamePrice()-((game.getGamePrice()*campaign.getDiscount())/100))+ "TL'ye satın aldınız. Keyifli alışverişler dileriz.");
        System.out.println("-------------------------------");
    }
}
