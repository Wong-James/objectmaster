package com.james.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		Human Ross = new Human("Ross");
		Human Oscar = new Human("Oscar");
		Wizard Mickey = new Wizard("Mickey");
		Ninja Naruto = new Ninja("Naruto");
		Samurai Jack = new Samurai("Jack");
		Oscar.attack(Ross);
		Oscar.attack(Ross);
		Oscar.attack(Ross);
		Oscar.attack(Ross);
		Oscar.attack(Ross);
		Mickey.fireball(Ross);
		Mickey.heal(Ross);
		Naruto.steal(Ross);
		Naruto.runAway();
		Jack.deathBlow(Ross);
		Jack.meditate();
		Jack.howMany();
		
		
	}

}
