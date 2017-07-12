package mammut.trendelenburg.de.items.ware;

public class IronShoes implements ItemRawShoes{

	String name = "Stahlkappenschuhe";
	int absorbtion = 5;
	
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
