package mammut.trendelenburg.de.items.ware;

public class IronHelmet implements ItemRawHelmet{
	
	int absorbtion = 15;
	String name = "Eisen Helm";
	
	public int getAbsorbtion(){
		return absorbtion;
	}

	@Override
	public void getTexture() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		return name;
	}
}
