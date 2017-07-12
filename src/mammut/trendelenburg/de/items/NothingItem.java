package mammut.trendelenburg.de.items;

public class NothingItem implements Item{

	boolean handable = true;
	int damage = 0;
	String name = "";

	@Override
	public void getTexture() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isHandable() {
		return handable;
	}

	@Override
	public int getDamage() {
		return damage;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean isHeal() {
		return false;
	}

}
