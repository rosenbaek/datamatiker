package com.Task3;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals = new ArrayList<>();

    void makeAllSounds(){
        for (int i = 0; i < animals.size(); i++) {
             animals.get(i).makeSound();
        }
    }

    void addAnimal(Animal tmpAnimal) {
        animals.add(tmpAnimal);
    }
    void printNumberOfLegs() {
        int legs = 0;
        for(int i = 0; i < animals.size(); i++) {
            legs += animals.get(i).getNumberOfLegs();
        }
        System.out.println("Total number of legs in my zoo: "+legs);
    }
}
