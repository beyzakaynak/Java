package gamesimulation;
import Services.CampaignServices;
import Entities.Campaign;

public class CampaignManager extends Campaign implements CampaignServices{
    @Override
    public void save(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + " İndirimi Oluşturuldu");
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + " İndirimi Silindi");
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + " İndirimi Güncellendi");

    }
}
