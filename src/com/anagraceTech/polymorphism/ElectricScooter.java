package com.anagraceTech.polymorphism;

public class ElectricScooter implements  Vehicles{

    private int currentSpeed;

    public ElectricScooter(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void move(int amount){
        this.currentSpeed += amount;
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
