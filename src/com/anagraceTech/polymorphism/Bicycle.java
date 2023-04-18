package com.anagraceTech.polymorphism;

public class Bicycle implements  Vehicles{

    private int currentSpeed;

    public Bicycle(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void move(int amount){
        this.currentSpeed += amount;
        System.out.println("This bicycle is pedalling at a speed of " + this.currentSpeed + "Km/h");
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
