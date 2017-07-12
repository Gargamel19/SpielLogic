package mammut.trenelenburg.de.client;

public class Client {



	public static void main(String[] args) {

		try {
		
			IGameLogic gl = new IGameLogic();
			GameEngine game = new GameEngine("Geilospiel", 600, 900, true, gl);
			game.start();

		} catch (Exception e) {
		}
	}
}
