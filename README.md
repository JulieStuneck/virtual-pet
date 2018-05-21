The user gets to name the pet.
The goal of the game is to increase the pet's happiness to 200. 
	When this happens, the pet asks to take a nap and the game ends.
When the pet is fed: 
	hunger goes down by 25, boredom goes down by 10 and happiness goes up by 15.
When a drink is given: 
	thirst goes down by 25, boredom goes down by 10 and happiness goes up by 15.
When the pet plays: 
	hunger goes up by 50, thirst goes up by 25, boredom goes down by 10 and happiness goes up by 15.
Each choice causes the pets sleepiness to increase by 25.

 /\ /\
(-0-0-)
  ><><
(     )
__(||) (||)


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