package J3B.farmapp.model.impl;

import java.util.ArrayList;
import java.util.List;

import J3B.farmapp.model.Growable;

public class Plant implements Growable {
    private String name;
    private int days_before_growing;
    private int days_to_age = 0;
    public int getDays_before_growing() {
        return days_before_growing;
    }
    public void setDays_before_growing(int days_before_growing) {
        this.days_before_growing = days_before_growing;
    }
    public int getDays_to_age() {
        return days_to_age;
    }
    public void setDays_to_age(int days_to_age) {
        this.days_to_age = days_to_age;
    }

    private String[] age_types = {"Seed", "Seedling", "Mature",
            "Sprouting","HarvestReady"};
    private int age = 0;

    public Plant(String name,int days_before_growing){
        this.name = name;
        this.days_before_growing = days_before_growing;
    }

    public String getAge() {
        return "("+age+")"+age_types[age];
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void grow() {
        if(age < age_types.length-1){
            if(days_to_age < days_before_growing - 1){
                days_to_age++;
            }else{
                age++;
                days_to_age = 0;
            }
        }
    }
    public String[] getAge_types() {
        return age_types;
    }
    public void setAge_types(String[] age_types) {
        this.age_types = age_types;
    }

    public int getDaysUntilNextPhase(){
        return days_before_growing-days_to_age;
    }

}
