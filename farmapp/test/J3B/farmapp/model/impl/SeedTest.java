package J3B.farmapp.model.impl;

import static org.junit.Assert.*;
import J3B.farmapp.model.impl.Seed;
import org.junit.Test;

public class SeedTest {

	@Test
	public void getName() {
		Seed getName = new Seed("papaya seed",new Plant("papaya" , 1));
		assertEquals(getName.getName(), "papaya seed" );
	}
	@Test
	public void setName(){
		Seed setName = new Seed("", new Plant ("apple", 1));
		setName.setName("apple seed");
		assertEquals(setName.getName(), "apple seed");
	}
	
	@Test
	public void getPlant() {
		Seed getPlant = new Seed("papaya seed",new Plant("papaya" , 1));
		assertEquals(getPlant.getPlant(),new Plant("papaya" , 1));
	}
	

}
