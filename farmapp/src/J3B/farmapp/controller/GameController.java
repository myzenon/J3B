package J3B.farmapp.controller;

import java.util.List;

import J3B.farmapp.model.impl.Bag;
import J3B.farmapp.model.impl.GardenBed;
import J3B.farmapp.model.impl.Plant;
import J3B.farmapp.model.impl.Seed;
import J3B.farmapp.view.ConsoleMenu;

public class GameController {
	private ConsoleMenu prompt;
	private GardenBed gardenBed;
	private Bag bag;

	public GameController() {
		prompt = new ConsoleMenu(this);
		gardenBed = new GardenBed(10);
		bag = new Bag();

		// test mock, no shop
		bag.addSeed(new Seed("Mango", new Plant("Mango Tree", 1)));
		bag.addSeed(new Seed("Apple", new Plant("Apple Tree", 1)));
		;
		bag.addSeed(new Seed("Extreme Berry", new Plant("Extreme Berry Tree", 10)));
	}

	public List<Plant> getPlants() {
		return this.gardenBed.getPlants();
	}

	public List<Seed> getSeeds() {
		return this.bag.getSeeds();
	}

	public void startGame() {
		do {
			prompt.showAll();
		} while (true);
	}

	public boolean plantSeed(Seed seed) {
		if (gardenBed.getPlants().size() < gardenBed.getCapacity()) {
			gardenBed.addPlant(seed.getPlant());
			return true;
		}
		return false;
	}

	public void sleep() {
		for (int i = 0; i < gardenBed.getPlants().size(); i++) {
			gardenBed.getPlants().get(i).grow();
		}
	}
}