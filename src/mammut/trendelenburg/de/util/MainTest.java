package mammut.trendelenburg.de.util;

import mammut.trendelenburg.de.items.Bread;
import mammut.trendelenburg.de.items.Knife;
import mammut.trendelenburg.de.items.ware.IronHelmet;
import mammut.trendelenburg.de.items.ware.IronPents;
import mammut.trendelenburg.de.items.ware.IronShoes;
import mammut.trendelenburg.de.items.ware.IronVest;
import mammut.trendelenburg.de.items.ware.LetherHelmet;
import mammut.trendelenburg.de.player.Player;

public class MainTest {

	public static void main(String[] args) {

		Player manni = new Player("Manni");

		Player peter = new Player("Peter");

		Bread bread = new Bread();
		Knife messer = new Knife();

		IronHelmet helm = new IronHelmet();
		IronVest vest = new IronVest();
		IronPents pents = new IronPents();
		IronShoes shoes = new IronShoes();

		LetherHelmet lederHelm = new LetherHelmet();
		
		peter.moveOn(helm);
		peter.moveOn(vest);
		peter.moveOn(pents);
		peter.moveOn(shoes);

		System.out.println("ruestung: " + peter.getRuesting());

		peter.moveOn(lederHelm);

		System.out.println("ruestung: " + peter.getRuesting());

		manni.setHand(messer);
		manni.punch(peter);
		System.out.println(peter.getHealth());
		peter.setHand(bread);
		peter.eat();
		System.out.println(peter.getHealth());
		manni.setHand(messer);
		manni.punch(peter);
		System.out.println(peter.getHealth());
		manni.setHand(messer);
		manni.punch(peter);
		System.out.println(peter.getHealth());

	}

}
