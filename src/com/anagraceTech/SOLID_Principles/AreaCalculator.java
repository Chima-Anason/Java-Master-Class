package com.anagraceTech.SOLID_Principles;

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
            /* ➡️ FixMe : This breaks the (2)Open Close principle because
                this class is open for modification whenever a new Shape class is created*/
            if(shape instanceof Cube){
                // Logic
            }
        }
        return sum;
    }


}
