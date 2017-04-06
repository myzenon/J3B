/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J3B.farmapp.model.impl;

/**
 *
 * @author bewblaze01
 */
import java.util.ArrayList;
import java.util.List;

public class Bag {

    private List<Seed> seeds;

    public Bag() {
        seeds = new ArrayList<Seed>();
    }

    public List<Seed> getSeeds() {
        return seeds;
    }

    public void addSeed(Seed seed) {
        seeds.add(seed);
    }
}
