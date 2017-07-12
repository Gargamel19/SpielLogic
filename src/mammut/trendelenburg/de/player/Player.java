package mammut.trendelenburg.de.player;

import java.util.ArrayList;

import mammut.trendelenburg.de.items.Item;
import mammut.trendelenburg.de.items.ItemHeal;
import mammut.trendelenburg.de.items.NothingItem;
import mammut.trendelenburg.de.items.ware.ItemRawHelmet;
import mammut.trendelenburg.de.items.ware.ItemRawPents;
import mammut.trendelenburg.de.items.ware.ItemRawShoes;
import mammut.trendelenburg.de.items.ware.ItemRawVest;
import mammut.trendelenburg.de.items.ware.NothingHelmet;
import mammut.trendelenburg.de.items.ware.NothingPents;
import mammut.trendelenburg.de.items.ware.NothingShoes;
import mammut.trendelenburg.de.items.ware.NothingVest;
import mammut.trendelenburg.de.util.Utils;

public class Player {
	
	private static boolean dead = false;

	final private String name;

	int health = 100;
	int ruesting = 0;

	public int z = 20;
	public int x, y = 100;

	Item inHand = new NothingItem();
	
	ItemRawHelmet helm = new NothingHelmet();
	ItemRawVest brust = new NothingVest();
	ItemRawPents hose = new NothingPents();
	ItemRawShoes schuhe = new NothingShoes();
	ArrayList<Item> inventory = new ArrayList<>();

	public Player(String name) {

		this.name = name;

	}
	
	public void punch(Player victim) {
		victim.damage(inHand.getDamage(), this, inHand.getName());
		
	}
	
	public void setHand(Item item){
		if (item.isHandable()) {
			inHand = item;
		}
	}
	
	public void eat() {
		if (inHand.isHeal()) {
			
			ItemHeal healItem = (ItemHeal) inHand;
			heal(healItem.getHeal());
		}
	}
	

	public int getRuesting() {
		return ruesting;
	}

	public String getName() {
		return this.name;
	}

	public int getHealth() {
		return this.health;
	}

	public boolean isDead() {
		return Player.dead;
	}

	public void heal(int hp) {

		if (health == 100 || dead) {

		} else {

			health = health + hp;
			if (health > 100) {
				health = health - (health - 100);
			}

		}

	}

	public void damage(int schaden, Player attacker, String itemName) {

		if (this.ruesting == 0) {
			health = health - schaden;
		} else {
			health = health - (schaden - ruesting/5);
			
			//TODO damage berechnen
		}
		if (this.health <= 0) {
			die(attacker, itemName);
		}
	}

	public void moveForward() {
		x = x + 5;
	}

	public void moveBack() {
		x = x - 5;
	}

	public void jump() {

		int temp;

		for (int i = 0; i < 20; i++) {

			temp = i - 10;
			z = z + Utils.difference(temp, 0) * 3;
			x = x + 5;

		}

	}

	private void die(Player attacker, String itemName) {
		health = 0;
		System.out
				.println(this.getName() + " wurde von " + attacker.getName() + " mit einem " + itemName + " getötet!");
		dead = true;

	}

	public void moveOn(ItemRawHelmet item) {
		this.ruesting = this.ruesting - helm.getAbsorbtion();
		helm = item;
		this.ruesting = this.ruesting + item.getAbsorbtion();
	}

	public void moveOn(ItemRawVest item) {
		this.ruesting = this.ruesting - brust.getAbsorbtion();
		brust = item;
		this.ruesting = this.ruesting + item.getAbsorbtion();
	}

	public void moveOn(ItemRawPents item) {
		this.ruesting = this.ruesting - hose.getAbsorbtion();
		hose = item;
		this.ruesting = this.ruesting + item.getAbsorbtion();
	}

	public void moveOn(ItemRawShoes item) {
		this.ruesting = this.ruesting - schuhe.getAbsorbtion();
		schuhe = item;
		this.ruesting = this.ruesting + item.getAbsorbtion();
	}

	public void moveOf(ItemRawHelmet item) {
		helm = new NothingHelmet();
		this.ruesting = this.ruesting - item.getAbsorbtion();
	}

	public void moveOf(ItemRawVest item) {
		brust = new NothingVest();
		this.ruesting = this.ruesting - item.getAbsorbtion();
	}

	public void moveOf(ItemRawPents item) {
		hose = new NothingPents();
		this.ruesting = this.ruesting - item.getAbsorbtion();
	}

	public void moveOf(ItemRawShoes item) {
		schuhe = new NothingShoes();
		this.ruesting = this.ruesting - item.getAbsorbtion();
	}

}
