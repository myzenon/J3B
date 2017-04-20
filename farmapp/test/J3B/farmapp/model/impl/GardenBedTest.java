package J3B.farmapp.model.impl;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;
import java.util.List;
import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by HP OMEN on 20/4/2560.
 */
public class GardenBedTest {
    @Test
    public void getCapacity() throws Exception {
    GardenBed gardenBed = new GardenBed( 20 );
    assertEquals(gardenBed.getCapacity(),20);
    }

    @Test
    public void setCapacity() throws Exception {
        GardenBed gardenBed = new GardenBed(0);
        gardenBed.setCapacity(20);
        assertEquals(gardenBed.getCapacity(),20);
    }

    @Test
    public void setPlants() throws Exception {
        List<Plant> listplant = new ArrayList<Plant>();
        Plant coconut = new Plant("coconut",10);
        Plant rice = new Plant("rice",10);
        listplant.add(rice);
        listplant.add(coconut);
        GardenBed gardenBed = new GardenBed(0);
        gardenBed.setPlants(listplant);
        assertEquals(gardenBed.getPlants(),listplant);
    }

    @Test
    public void getPlants() throws Exception {
        List<Plant> listplant = new ArrayList<Plant>();
        Plant plant = new Plant("coconut",10);
        Plant rice = new Plant("rice",10);
        listplant.add(plant);
        listplant.add(rice);
        GardenBed gardenBed = new GardenBed(0);
        gardenBed.addPlant(plant);
        gardenBed.addPlant(rice);
        assertEquals(gardenBed.getPlants(),listplant);
    }

    @Test
    public void addPlant() throws Exception {
        Plant plant = new Plant("coconut",10);
        GardenBed gardenBed = new GardenBed(0);
        gardenBed.addPlant(plant);
        assertEquals(gardenBed.getPlants().contains(plant),true);
    }


    @Test
    public void removePlant() throws Exception {
        Plant plant = new Plant("coconut",10);
        Plant rice = new Plant("rice",10);
        GardenBed gardenBed = new GardenBed(0);
        gardenBed.addPlant(plant);
        gardenBed.addPlant(rice);
        gardenBed.removePlant(0);
        assertEquals(gardenBed.getPlants().contains(plant),false);
    }

}