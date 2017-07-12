package mammut.trendelenburg.de.items.ware;

public class IronPents implements ItemRawPents{

	String name = "Eisen Knieschoner";
	int absorbtion = 10;
	
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
