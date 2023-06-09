package com.anagraceTech.SOLID_Principles;

import java.util.List;

public class ShapesPrinter {

    private final IAreaCalculator areaCalculator;

    public ShapesPrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    /* ➡️ FixMe : This breaks the (5)Dependency Inversion principle because
                we are depending on the Concrete class instead of the abstract class*/

    public String json(List<Shape> shapes){
        return "{shapeSum: %s}".formatted(areaCalculator.sum(shapes));
    }

    public String csv(List<Shape> shapes){
        return "shape_sum,%s".formatted(areaCalculator.sum(shapes));
    }


}
