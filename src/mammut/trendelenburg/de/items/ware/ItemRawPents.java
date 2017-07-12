package mammut.trendelenburg.de.items.ware;

import mammut.trendelenburg.de.items.Item;

public interface ItemRawPents extends Item {


	public int position = 1;

	public int getAbsorbtion();
	
	public void getTexture();
	
	public default boolean isHandable() {
		return false;
	}
	
	public default int getDamage() {
		return 0;
	}
	public default boolean isHeal() {
		return false;
	}
}
