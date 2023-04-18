package com.anagraceTech.polymorphism;

import com.anagraceTech.abstractExample.EmailExtractorReport;
import com.anagraceTech.abstractExample.ExtractorReport;
import com.anagraceTech.abstractExample.NumberExtractorReport;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {

        //Polymorphism - Many Forms
            //Vehicle(car, bicycle, electric scooter) but their internals are different: meaning the way they move differs
            // Car - move() , break(), getCurrentSpeed()
            // Bicycle - move() , break(), getCurrentSpeed()
            // Electric Scooter - move() , break(), getCurrentSpeed()

        Car car = new Car(50);
        Bicycle bicycle = new Bicycle(25);
        ElectricScooter electricScooter = new ElectricScooter(15);

        Vehicles[] vehicles = {car, bicycle, electricScooter};

        Person person1 = new Person("james", vehicles);
        for (Vehicles vehicle : person1.getVehicles()) {
            vehicle.move(30);
            System.out.println();
        }

    }
}
