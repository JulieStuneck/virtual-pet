package VirtualPetTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import VirtualPet.VirtualPet;

public class VirtualPetTest {
	// Hunger

	@Test
	public void shouldHaveADefaultHungerOf100() {
		VirtualPet underTest = new VirtualPet(100, 0, 0, 0);
		int check = underTest.getHunger();
		assertEquals(100, check);
	}

	@Test
	public void shouldHaveDefaultHungerOf200() {
		VirtualPet underTest = new VirtualPet(200, 0, 0, 0);
		int check = underTest.getHunger();
		assertEquals(200, check);
	}

	@Test
	public void shouldHaveHungerOf75AfterFeeding25() {
		VirtualPet underTest = new VirtualPet(100, 0, 0, 0);
		underTest.feed();
		int check = underTest.getHunger();
		assertEquals(75, check);
	}

	@Test
	public void shouldHaveHungerOf150AfterActivity() {
		VirtualPet underTest = new VirtualPet(100, 0, 0, 0);
		underTest.activity();
		int check = underTest.getHunger();
		assertEquals(150, check);
	}

	@Test
	public void shouldHaveHungerof110AfterTick() {
		VirtualPet underTest = new VirtualPet(100, 0, 0, 0);
		underTest.tick();
		int check = underTest.getHunger();
		assertEquals(110, check);
	}
	// Thirst

	@Test
	public void shouldHaveDefaultThirst() {
		VirtualPet underTest = new VirtualPet(0, 100, 0, 0);
		int check = underTest.getThirst();
		assertEquals(100, check);

	}

	@Test
	public void shouldHaveThirstOf75AfterDrink() {
		VirtualPet underTest = new VirtualPet(0, 100, 0, 0);
		underTest.drink();
		int check = underTest.getThirst();
		assertEquals(75, check);
	}

	@Test
	public void shouldHaveThirstOf125AfterActivity() {
		VirtualPet underTest = new VirtualPet(0, 100, 0, 0);
		underTest.activity();
		int check = underTest.getThirst();
		assertEquals(125, check);
	}

	@Test
	public void shouldHaveThirstOf110AfterTick() {
		VirtualPet underTest = new VirtualPet(0, 100, 0, 0);
		underTest.tick();
		int check = underTest.getThirst();
		assertEquals(110, check);
	}

	// boredom
	@Test
	public void shouldHaveBoredomOf70AfterActivity() {
		VirtualPet underTest = new VirtualPet(0, 0, 100, 0);
		underTest.activity();
		int check = underTest.getBoredom();
		assertEquals(70, check);
	}

	@Test
	public void shouldHaveBoredomOf110AfterTick() {
		VirtualPet underTest = new VirtualPet(0, 0, 100, 0);
		underTest.tick();
		int check = underTest.getBoredom();
		assertEquals(110, check);
	}

	// happiness

	@Test
	public void shouldHaveDefaultHappinessOf103() {
		VirtualPet underTest = new VirtualPet(0, 0, 0, 103);
		int check = underTest.getHappiness();
		assertEquals(103, check);
	}

	@Test
	public void shouldHaveHappinessOf115AfterFeed() {
		VirtualPet underTest = new VirtualPet(0, 0, 0, 100);
		underTest.feed();
		int check = underTest.getHappiness();
		assertEquals(115, check);
	}

	@Test
	public void shouldHaveHappinessOf135AfterDrink() {
		VirtualPet underTest = new VirtualPet(0, 0, 0, 120);
		underTest.drink();
		int check = underTest.getHappiness();
		assertEquals(135, check);
	}
	
	@Test
	public void shouldHaveHappinessOf75AfterActivity() {
		VirtualPet underTest = new VirtualPet(0, 0, 0, 60);
		underTest.activity();
		int check = underTest.getHappiness();
		assertEquals(75, check);
	}
}