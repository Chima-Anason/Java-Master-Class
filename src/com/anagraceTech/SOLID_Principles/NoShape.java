package com.anagraceTech.SOLID_Principles;

public class NoShape implements Shape{
    @Override
    public double area() {
        /* ➡️ FixMe : This breaks the (3)Liskov principle because
                this class is not substitutable for the Parent Class Shape*/
        throw new IllegalStateException("Cannot calculate Area");
    }
}
