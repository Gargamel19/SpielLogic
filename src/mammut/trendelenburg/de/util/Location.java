package mammut.trendelenburg.de.util;

import mammut.trendelenburg.de.player.Player;

public class Location<T> {
	
	public int x, y, z;
	
	public Location(T loc) {

		Player player = new Player("test");
		if (loc.getClass().isInstance(player.getClass())) {
			Player locP =(Player) loc;
			this.x = locP.x;
			this.y = locP.y;
			this.z = locP.z;
		}

	}

	public Location(int x,int y,int z) {
		this.x = x;
		this.y = y;
		this.z = z;

	}

}
