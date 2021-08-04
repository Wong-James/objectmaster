package com.james.objectmaster;

public class Wizard extends Human {

	public Wizard() {
		this.setHealth(getHealth()-50);
		this.setIntelligence(getIntelligence()+5);
	}

	public Wizard(String name) {
		super(name);
		this.setHealth(getHealth()-50);
		this.setIntelligence(getIntelligence()+5);
	}
	
	public void heal(Human target) {
		target.setHealth(target.getHealth() + this.getIntelligence());
		System.out.println(this.getName() + " healed " + target.getName() + "! Health: " + target.getHealth());
	}

	public void fireball(Human target) {
		target.setHealth(target.getHealth() - (this.getIntelligence()*3));
		System.out.println(this.getName() + " attacked " + target.getName() + "! Health: " + target.getHealth());
	}
}
