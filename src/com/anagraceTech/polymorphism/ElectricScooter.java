package com.anagraceTech.polymorphism;

public class ElectricScooter implements  Vehicles{

    private int currentSpeed;

    public ElectricScooter(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void move(int amount){
        System.out.println("hop on and press button!!!!");
        this.currentSpeed += amount;
        System.out.println("This Electric Scooter is rolling at a speed of " + this.currentSpeed + "Km/h");
    }

    @Override
    public void applyBreaks(int amount){
        this.currentSpeed -= amount;
    }

    @Override
    public int getCurrentSpeed() {
        return currentSpeed;
    }
}
