package VirtualPet;

public class VirtualPet {

	private int hunger;
	private int thirst;
	private int boredom;
	private int happiness;

	public VirtualPet(int hunger, int thirst, int boredom, int happiness) {
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
		this.happiness = happiness;
	}

	public int getHunger() {
		return hunger;
	}

	public void feed() {
		hunger -= 25;
		boredom -= 25;
		happiness += 15;
	}

	public void activity() {
		hunger += 50;
		thirst += 25;
		boredom -= 30;
		happiness += 15;
	}

	public int getThirst() {
		return thirst;
	}

	public void drink() {
		thirst -= 25;
		boredom -= 20;
		happiness += 15;

	}

	public int getBoredom() {
		return boredom;
	}

	public void tick() {
		hunger += 10;
		thirst += 10;
		boredom += 10;
	}

	public int getHappiness() {
		return happiness;
	}

}
