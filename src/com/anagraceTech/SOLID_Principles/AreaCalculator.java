package com.anagraceTech.SOLID_Principles;

import java.util.List;

public class AreaCalculator {

    public int sum(List<Shape> shapes){
        int sum = 0;
        for (int i = 0; i < shapes.size(); i++) {
            Shape shape = shapes.get(i);
            sum += shape.area();
            /* ➡️ FixMe : This breaks the (2)Open Close principle because
                this class is open for modification whenever a new Shape class is created*/

        }
        return sum;
    }


}
