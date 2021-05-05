package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Member;

public interface GameService {

	void add(Game game);
	void update(Game game);
	void remove(Game game);
	void saleWithCampaign(Game game,Member member,Campaign campaign);
	void saleWithoutCampaign(Game game, Member member);
}
