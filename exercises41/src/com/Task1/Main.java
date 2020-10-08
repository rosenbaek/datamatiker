package com.Task1;

import com.Task1.Car;
import com.Task1.Driver;

public class Main {


    public static void main(String[] args) {
        Driver driver = new Driver("Christian", 26);
        Car car = new Car("Ferrari","Spider",2020, "Standard");

        car.setDriver(driver);
        System.out.println(car);
        System.out.println(driver);

        Car car1 = new Car("Posche","911",2020, "Sport");
        car1.setDriver(driver);
        System.out.println(car1);
        System.out.println(driver);

    }
}
