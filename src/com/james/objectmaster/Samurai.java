package com.james.objectmaster;

public class Samurai extends Human {
	private static int samuraiCount;

	public Samurai() {
		this.setHealth(getHealth()+100);
		samuraiCount++;
	}

	public Samurai(String name) {
		super(name);
		this.setHealth(getHealth()+100);
		samuraiCount++;
		// TODO Auto-generated constructor stub
	}
	
	public void deathBlow(Human target) {
		target.setHealth(target.getHealth() - target.getHealth());
		this.setHealth(this.getHealth()/2);
		System.out.println(this.getName() +" has killed " + target.getName() +"!");
		System.out.println(target.getName() + " Health:" + target.getHealth());
		System.out.println(this.getName() + " Health: " + this.getHealth());
	}
	
	public void meditate() {
		this.setHealth(this.getHealth() + (this.getHealth()/2));
		System.out.println(this.getName() + "has meditated and healed. Health: " +this.getHealth());
	}

	public void howMany() {
		System.out.println("There are/is "+samuraiCount+" Samurai");
	}
}
