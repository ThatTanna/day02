package main;

import java.util.Date;

import models.Car;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car("S12");
        Car myOtherCar = new Car("S13");

        myCar.setColour("red");
        myCar.setMake("Honda");
        myCar.setRegistration("S1234A");
        myCar.setRegistrationDate(new Date());

        myCar.horn();
        System.out.printf("color: %s, make: %s, registration: %s\n",
            myCar.getColour(), myCar.getMake(), myCar.getRegistration());

        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();

        System.out.printf("acceleration: %d\n", myCar.getAcceleration());
    }
    
}
