package J3B.farmapp.model.impl;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PlantTest {
    @Test
    public void getDays_before_growing() throws Exception {
        Plant plant = new Plant("Palm", 10);
        assertEquals(plant.getDays_before_growing(), 10);
    }

    @Test
    public void setDays_before_growing() throws Exception {
        Plant plant = new Plant("Palm", 10);
        plant.setDays_before_growing(20);
        assertEquals(plant.getDays_before_growing(), 20);
    }

    @Test
    public void getDays_to_age() throws Exception {
        Plant plant = new Plant("Palm", 10);
        plant.grow();
        plant.grow();
        assertEquals(plant.getDays_to_age(), 2);
    }

    @Test
    public void setDays_to_age() throws Exception {
        Plant plant = new Plant("Palm", 10);
        plant.setDays_to_age(20);
        assertEquals(plant.getDays_to_age(), 20);
    }

    @Test
    public void getAge() throws Exception {
        Plant plant = new Plant("Palm", 1);
        plant.grow();
        plant.setAge(2);
        assertEquals(plant.getAge(), "(2)Mature");
    }

    @Test
    public void setAge() throws Exception {
        Plant plant = new Plant("Palm", 1);
        plant.grow();
        plant.setAge(2);
        assertEquals(plant.getAge(), "(2)Mature");

    }

    @Test
    public void setName() throws Exception {
        Plant plant = new Plant("Palm", 20);
        plant.setName("Coconut");
        assertEquals(plant.getName(), "Coconut");
    }

    @Test
    public void getName() throws Exception {
        Plant plant = new Plant("Coconut", 10);
        assertEquals(plant.getName(), "Coconut");
    }

    @Test
    public void growNormal() throws Exception {
        Plant plant = new Plant("Coconut", 2);
        plant.grow();
        assertEquals(plant.getDays_to_age(), 1);
    }

    @Test
    public void growAgeType() throws Exception {
        Plant plant = new Plant("Coconut", 2);
        plant.grow();
        plant.grow();
        assertEquals(plant.getAge(), "(1)Seedling");
        assertEquals(plant.getDays_to_age(), 0);
    }

    @Test
    public void growFinal() throws Exception {
        Plant plant = new Plant("Coconut", 1);
        for (int i = 0; i < 20; i++) {
            plant.grow();
        }
        assertEquals(plant.getAge(), "(4)HarvestReady");
    }

    @Test
    public void getAge_types() throws Exception {
        String[] default_age_types = {"Seed", "Seedling", "Mature",
                "Sprouting","HarvestReady"};
        Plant plant = new Plant("Coconut", 2);
        assertEquals(plant.getAge_types(), default_age_types);
    }

    @Test
    public void setAge_types() throws Exception {
        String[] new_age_types = {"Mature",
                "Sprouting","HarvestReady"};
        Plant plant = new Plant("Coconut", 2);
        plant.setAge_types(new_age_types);
        assertEquals(plant.getAge_types(), new_age_types);
    }

    @Test
    public void getDaysUntilNextPhase() throws Exception {
        Plant plant = new Plant("Coconut", 20);
        plant.grow();
        plant.grow();
        assertEquals(plant.getDaysUntilNextPhase(), (20-2));
    }

}