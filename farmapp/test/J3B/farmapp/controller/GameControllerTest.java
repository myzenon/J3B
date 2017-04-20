package J3B.farmapp.controller;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.awt.List;
import java.util.ArrayList;

import org.junit.Test;

import J3B.farmapp.model.impl.Plant;
import J3B.farmapp.model.impl.Seed;
public class GameControllerTest {
	@Test
	public void testGetPlants(){
		GameController gameController = new GameController();
		Plant mangoPlant = new Plant("Mango Tree",1);
		Seed seed = new Seed("Mango",mangoPlant);// Mango Seed
		gameController.plantSeed(seed);//Add one Mango seed

		
		ArrayList<Plant> plants = new ArrayList<Plant>();//Answer List
		plants.add(mangoPlant);//add mango plant 1
		assertEquals(gameController.getPlants(),plants);
		//assertThat(gameController.getPlants(),is(plants));

	}
	@Test
	public void testGetSeeds(){
		GameController gameController = new GameController();
		//gameController constructor have 3 seeds in the list
		assertEquals(gameController.getSeeds().size(),3);
	}
	@Test
	public void testPlantSeed(){
		GameController gameController = new GameController();
		//create mango seed
		Plant mangoPlant = new Plant("Mango Tree",1);
		Seed seed = new Seed("Mango",mangoPlant);
		gameController.plantSeed(seed);
		//a Mango tree must have been created in gameController's GardenBed
		//get name of recently added plant,it must be "Mango Tree"
		String strMangoTree = gameController.getPlants().get(gameController.getPlants().size()-1).getName();
		assertEquals(strMangoTree,"Mango Tree");
	}
	@Test
	public void testPlantSeedFalse(){
		// Create gardenbed capacity of 10
		GameController gameController = new GameController();
		//create mango seed
		Plant mangoPlant = new Plant("Mango Tree",1);
		Seed seed = new Seed("Mango",mangoPlant);
		for(int i = 0 ; i<10 ; i++){
			gameController.plantSeed(seed); // add 10 seeds into the list	
		}
		//create Berry seed
				Plant berryPlant = new Plant("Berry Tree",1);
				Seed seedBerry = new Seed("Berry",berryPlant);
	   //plant Berry seed
				gameController.plantSeed(seedBerry);
		//String must be MangoTree because berry cant be plant
				String strMangoTree = gameController.getPlants().get(gameController.getPlants().size()-1).getName();
				assertEquals(strMangoTree,"Mango Tree");
	}
	@Test
	public void testSleep(){
		GameController gameController = new GameController();
		//create mango seed
		Plant mangoPlant = new Plant("Mango Tree",1);
		Seed seed = new Seed("Mango",mangoPlant);
		gameController.plantSeed(seed);
		//a Mango tree must have been created in gameController's GardenBed
		//create mango seed
		Plant berryPlant = new Plant("Berry Tree",1);
		Seed seed2 = new Seed("Berry",berryPlant);
		gameController.plantSeed(seed2);
		//a Berry tree must have been created in gameController's GardenBed
		//Both tree age must be(0)Seed
		assertEquals(gameController.getPlants().get(0).getAge(),"(0)Seed");
		assertEquals(gameController.getPlants().get(1).getAge(),"(0)Seed");
		gameController.sleep();
		//Both tree age must be(1)Seedling
		assertEquals(gameController.getPlants().get(0).getAge(),"(1)Seedling");
		assertEquals(gameController.getPlants().get(1).getAge(),"(1)Seedling");
	}
}
