package com.Task3;

public class Tiger extends Animal{
    public Tiger(int numberOfLegs) {
        super(numberOfLegs);


    }
    @Override
    public void makeSound() {
        System.out.println("Tiger goes grrrr");
    }
}
