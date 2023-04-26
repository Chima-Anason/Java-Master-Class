package com.anagraceTech.SOLID_Principles.S_part;

import java.util.List;

public class AreaCalculator {

    public int sum(List<Object> shapes){
        int sum = 0;
        for (int i = 0; i < shapes.size(); i++) {
            Object shape = shapes.get(i);
            if(shape instanceof Square){
                sum += Math.pow(((Square) shape).getLength(), 2);
            }
            if(shape instanceof Circle){
                sum += Math.PI* Math.pow(((Circle) shape).getRadius(), 2);
            }
        }
        return sum;
    }


    /* ➡️ FixMe : This breaks the (1)Single Responsibilty principle because
                this class is filled with excessive functionality*/
    // Solution : Move them to another new class

    /*public String json(List<Object> shapes){
        return "{sum: %s}".formatted(sum(shapes));
    }

    public String csv(List<Object> shapes){
        return "sum,%s".formatted(sum(shapes));
    }*/
}