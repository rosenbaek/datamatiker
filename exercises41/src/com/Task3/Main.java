package com.Task3;

public class Main {


    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Tiger tiger = new Tiger(4);
        Bird bird = new Bird(2);
        Lion lion = new Lion(3);

        zoo.addAnimal(tiger);
        zoo.addAnimal(bird);
        zoo.addAnimal(lion);

        zoo.makeAllSounds();
        zoo.printNumberOfLegs();
    }
}
