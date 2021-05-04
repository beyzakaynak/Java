package gamesimulation;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

    public static void main(String[] args) throws Exception {
        Gamer gamer1 = new Gamer(1, "Beyzanur", "Kaynak", 25151682684L ,1998);
        Gamer gamer2 = new Gamer(0, "Ali", "Kaynak", 25279380320L, 1969);

        Game game1 = new Game(1, "Super Mario", 500);
        Game game2 = new Game(2, "Blur", 900);

        Campaign campaign1 = new Campaign("Black Friday ", 10);
        Campaign campaign2 = new Campaign("Happy New Year", 20);
        Campaign campaign3 = new Campaign("Happy Birthday", 20);


        GamerManager gamerManager = new GamerManager(new CheckManager());
        gamerManager.save(gamer1);
        CheckManager checkManager = new CheckManager();
        checkManager.check(gamer1);

        PurchaseManager purchaseManager = new PurchaseManager();
        purchaseManager.discountSale(gamer1, game1, campaign1);


        gamerManager.save(gamer2);
        checkManager.check(gamer2);
        gamerManager.update(gamer2);

        CampaignManager campaignManager = new CampaignManager();
        campaignManager.save(campaign3);
        campaignManager.delete(campaign2);
        campaignManager.update(campaign1);


    }
}
