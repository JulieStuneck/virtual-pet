package VirtualPet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPet myVirtualPet = new VirtualPet(100, 100, 100, 100);

		System.out.println("Hi! My name is ????"); // Julie create name

		System.out.println("My hunger level is " + myVirtualPet.getHunger() + ", my thirst level is "
				+ myVirtualPet.getThirst() + " and my boredom level is " + myVirtualPet.getBoredom() + ".");
		System.out.println(
				"My happiness level is " + myVirtualPet.getHappiness() + ". Try to get my happiness level to 200!");
		System.out.println("");

		System.out.println("What should we do together?");
		System.out.println("1 = Feed me.");
		System.out.println("2 = Give me a drink.");
		System.out.println("3 = Play with me.");
		int doNext = input.nextInt();

		if (doNext == 1) {
			myVirtualPet.feed();
			
		} else if (doNext == 2) {
			myVirtualPet.drink();

		} else if (doNext == 3) {
			myVirtualPet.activity();
			
		} else {
			System.out.println("That's not one of the options. Try again.");
		}
		
		System.out.println("My hunger level is " + myVirtualPet.getHunger() + ", my thirst level is "
				+ myVirtualPet.getThirst() + " and my boredom level is " + myVirtualPet.getBoredom() + ".");
		System.out.println(
				"My happiness level is " + myVirtualPet.getHappiness() + ". Try to get my happiness level to 200!");
		System.out.println("");

	}
}
