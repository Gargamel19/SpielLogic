package mammut.trendelenburg.de.items;

public interface ItemHeal extends Item{

	public int getHeal();

	public default boolean isHeal() {
		return true;
	}
}
