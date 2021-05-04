package Services;
import Entities.Campaign;

public interface CampaignServices {
    void save(Campaign campaign);
    void delete(Campaign campaign);
    void update(Campaign campaign);

}