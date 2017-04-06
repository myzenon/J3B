package J3B.farmapp.model.impl;


import java.util.List;
import java.util.Scanner;

public class ConsoleMenu {
	private Scanner in;
	private int menuState = 0;

	private GameController gameController;

	public ConsoleMenu(GameController gameController) {
		in = new Scanner(System.in);
		this.gameController = gameController;
	}

	public void showAll() {
		System.out.println("--Select an action--");
		System.out.println("1.View Plants in Garden");
		System.out.println("2.Plant a seed");
		System.out.println("3.Sleep One day");
		System.out.println("Please select an action (1-3");
		menuState = in.nextInt();
		switch (menuState) {
		case 1:
			viewPlants();
			break;
		case 2:
			seedPlant();
			break;
		case 3:
			sleep();
			break;

		}
	}

	public void viewPlants() {
		List<Plant> plants = gameController.getPlants();
		System.out.println("--Your Garden Bed--");
		for (int i = 0; i < plants.size(); i++) {
			System.out.println((i + 1) + "." + plants.get(i).getName());
			System.out.println("\tAge:" + plants.get(i).getAge() + "\n\tDays until next phase:"
					+ plants.get(i).getDaysUntilNextPhase());
		}
		System.out.println("any number to continue..");
		menuState = in.nextInt();
	}

	public void seedPlant() {
		List<Seed> seeds = gameController.getSeeds();
		System.out.println("--Pick a seed--");
		for (int i = 0; i < seeds.size(); i++) {
			System.out.println((i + 1) + "." + seeds.get(i).getName());
		}
		menuState = in.nextInt();
		// plant selected seed
		gameController.plantSeed(seeds.get(menuState - 1));
	}

	public void sleep() {
		gameController.sleep();
		System.out.println("A long hardworking day have past!");

	}

}