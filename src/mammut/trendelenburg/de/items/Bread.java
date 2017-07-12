package mammut.trendelenburg.de.items;

public class Bread implements ItemHeal{

	String name = "Brot";
	int damage = 8;
	int heal = 10;
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
	public int getHeal() {
		return heal;
	}

}
