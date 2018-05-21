package VirtualPet;

public class VirtualPet {

	private int hunger;
	private int thirst;
	private int boredom;
	private int happiness;
	private int sleepiness;
	public int tick;

	public VirtualPet(int hunger, int thirst, int boredom, int happiness, int sleepiness) {
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
		this.happiness = happiness;
		this.sleepiness = sleepiness;
	}

	public int getHunger() {
		return hunger;
	}

	public void feed() {
		hunger -= 25;
		boredom -= 10;
		happiness += 15;
	}

	public void activity() {
		hunger += 50;
		thirst += 25;
		boredom -= 10;
		happiness += 15;
	}

	public int getThirst() {
		return thirst;
	}

	public void drink() {
		thirst -= 25;
		boredom -= 10;
		happiness += 15;

	}

	public int getBoredom() {
		return boredom;
	}

	public int getHappiness() {
		return happiness;
	}
	

	public int getSleepiness() {
		sleepiness += tick * 25;
		return sleepiness;
	}

	public void tick() {
		tick = tick + 1;
	}

}
