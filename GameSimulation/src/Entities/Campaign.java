package Entities;

public class Campaign {
    private String campaignName;
    private int discount;


    public Campaign() {
    }

    public Campaign(String campaignName, int discount) {
        this.campaignName = campaignName;
        this.discount = discount;

    }


    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

}