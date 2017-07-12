package mammut.trendelenburg.de.items;

public class Knife implements Item{

	String name = "Messer";
	int damage = 50;
	boolean handable = true;
	
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
