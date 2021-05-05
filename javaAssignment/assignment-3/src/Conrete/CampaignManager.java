package Conrete;

import Abstract.CampaignService;
import Entities.Campaign;
import Entities.Member;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		
		System.out.println(campaign.getName() + " Campaign added.");
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println(campaign.getName() + " Campaign update.");
	}

	@Override
	public void remove(Campaign campaign) {
		
		System.out.println(campaign.getName() + " Campaign remove.");
	}

}
