package concretes;
import abstracts.CampaignService;
import entities.Campaign;
public class CampaignManager {





    public class CampaignManager implements CampaignService{

        @Override
        public void add(Campaign campaign) {
            System.out.println(campaign.getCampaignName() + " kampanyasý eklenmiţtir!");

        }

        @Override
        public void delete(Campaign campaign) {
            System.out.println(campaign.getCampaignName() + " kampanyasý silinmiţtir!");
        }

        @Override
        public void update(Campaign campaign) {
            System.out.println(campaign.getCampaignName() + " kampanyasý güncellenmiţtir!")

        }

}
