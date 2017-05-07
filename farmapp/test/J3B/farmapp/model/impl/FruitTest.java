package J3B.farmapp.model.impl;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by shado on 8/5/2560.
 */
public class FruitTest {
    @Test
    public void getName() throws Exception {
        Fruit fruit = new Fruit("Coconut", 50);
        assertEquals(fruit.getName(), "Coconut" );
    }

    @Test
    public void getHungerStat() throws Exception {
        Fruit fruit1 = new Fruit("Coconut", 50);
        assertEquals(fruit1.getHungerStat(),"50");
    }

}