package com.anagraceTech.SOLID_Principles;

public class Circle implements Shape{

    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI* Math.pow(getRadius(), 2);
    }

    /* ➡️ FixMe : This breaks the (4)Interface Segregation principle because
                this class Circle can not calculate Volume because its not a 3-D Shape*/

}
