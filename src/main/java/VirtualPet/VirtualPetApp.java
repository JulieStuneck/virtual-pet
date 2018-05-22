package VirtualPet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPet myVirtualPet = new VirtualPet(100, 100, 100, 100, 0);

		System.out.println(" /\\ /\\");
		System.out.println("(-0-0-)");
		System.out.println("  ><><");
		System.out.println("(     )");
		System.out.println("__(||) (||)");

		System.out.println("Hi! I'm your new pet. What would you like to call me? ");
		String petName = input.next();
		System.out.println(petName + " is a great name! Thanks.");
		System.out.println("");

		do {
			System.out.println("tick is " + myVirtualPet.tick);// for testing tick - delete later
			System.out.println("sleepiness is " + myVirtualPet.getSleepiness());// testing - delete

			System.out.println("Here's how I'm feeling now:");
			System.out.println("My hunger level is " + myVirtualPet.getHunger() + ", my thirst level is "
					+ myVirtualPet.getThirst() + ", my boredom level is " + myVirtualPet.getBoredom()
					+ " and my sleepiness level is " + myVirtualPet.getSleepiness() + ".");
			System.out.println(
					"My happiness level is " + myVirtualPet.getHappiness() + ". Try to get my happiness level to 200!");
			System.out.println("");

			System.out.println("What should we do together?");
			System.out.println("1 = Eat");
			System.out.println("2 = Drink");
			System.out.println("3 = Play");
			int doNext = input.nextInt();

			if (doNext == 1) {
				myVirtualPet.feed();
				System.out.println("");
				System.out.println("Yummy, yummy in " + petName + "'s tummy! Thank you!");
				System.out.println("");

			}
			if (doNext == 2) {
				myVirtualPet.drink();
				System.out.println("");
				System.out.println("A nice cool drink of water was just what I needed.");
				System.out.println("");

			}
			if (doNext == 3) {
				myVirtualPet.activity();
				System.out.println("");
				System.out.println("I love playing with you!");
				System.out.println();
			}

			if (doNext >= 3) {
				System.out.println("");
				System.out.println("That's not one of the options. Try again.");
			}

			myVirtualPet.tick += 1;

		} while (myVirtualPet.getHappiness() <= 200);

		System.out.println("Yay! My happiness is " + myVirtualPet.getHappiness() + "! However, my sleepiness is now "
				+ myVirtualPet.getSleepiness() + ".");
		System.out.println("I'm so happy and sleepy I need a nap! You are the best pet owner ever :)!");
		System.out.println("See you next time.");
		
		input.close();
	}

}