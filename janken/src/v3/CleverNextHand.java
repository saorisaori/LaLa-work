package v3;

import java.util.Random;

public class CleverNextHand implements NextHands {
	private Player player;
	
	public CleverNextHand() {}
	
	public void setPlayer(Player player) {
		this.player = player;
	}
	@Override
	public int decideHand() {
		int hand = -1;
		// result = "draw" --> (hand + 1) % 3 を出す
		if (this.player == null) {
			return new Random().nextInt(3);
			
		}
		if (this.player.getResult() != null &&
				this.player.getHand().equal("draw")) {
			hand = new Random().nextInt(3);+1) %3;
		
	}else {
			
		}
		return 0;
	}

}
