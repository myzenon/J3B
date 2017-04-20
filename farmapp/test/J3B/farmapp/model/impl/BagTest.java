package J3B.farmapp.model.impl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BagTest {

	@Test
	public void addSeed() {
		Seed Seed = new Seed("apple seed" ,new Plant("apple",1));
		Bag addSeed = new Bag();
		addSeed.addSeed(Seed);
		assertEquals(addSeed.getSeeds().contains(Seed),true);
	}
	@Test
	public void getSeeds(){
		Seed seed = new Seed("orange seed" , new Plant ("orange",1));
		Bag addSeed = new Bag();
		addSeed.addSeed(seed);
		
		
		List<Seed> Add = new ArrayList<Seed>();
		
	   Add.add(seed);
	   assertEquals(addSeed.getSeeds(),Add);
		
		
		
	}

}
