package mammut.trendelenburg.de.items.ware;

public class IronVest implements ItemRawVest{

	String name = "Eisen Veste";
	int absorbtion = 30;
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getAbsorbtion() {
		return absorbtion;
	}

	@Override
	public void getTexture() {
		// TODO Auto-generated method stub
		
	}

}
