package com.james.objectmaster;

public class Ninja extends Human {

	public Ninja() {
		this.setStealth(getStealth() + 7);
	}

	public Ninja(String name) {
		super(name);
		this.setStealth(getStealth() + 7);
		// TODO Auto-generated constructor stub
	}
	public void steal(Human target) {
		target.setHealth(target.getHealth()-this.getStealth());
		this.setHealth(this.getHealth()+this.getStealth());
		System.out.println(this.getName()+ " stole health from " + target.getName());
		System.out.println(this.getName() + "Health: " + this.getHealth());
		System.out.println(target.getName()+ "Health: " + target.getHealth());
	}
	
	public void runAway() {
		this.setHealth(getHealth()-10);
		System.out.println(this.getName()+" ran away!");
		System.out.println("Health: " + this.getHealth());
		
	}

}
