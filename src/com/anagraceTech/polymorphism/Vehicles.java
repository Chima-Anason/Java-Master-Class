package com.anagraceTech.polymorphism;

public interface Vehicles {

    //interfaces can have the following:

    //1. constants
    double PURCHASE_RATE = 0.5;

    //2. abstract methods
    void move(int amount);

    void applyBreaks(int amount);

    int getCurrentSpeed();

    // default methods
    default double milesToKm(){
        return getCurrentSpeed()* 1.609;
    }
}
