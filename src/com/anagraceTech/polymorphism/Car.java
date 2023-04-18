package com.anagraceTech.polymorphism;

public class Car implements Vehicles{

    private int currentSpeed;

    public Car(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void move(int amount){
        this.currentSpeed += amount;
        System.out.println("Start engine!!!!");
        System.out.println("This car is accelerating at a speed of " + this.currentSpeed + "Km/h");
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
