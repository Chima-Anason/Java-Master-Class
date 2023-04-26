package com.anagraceTech.SOLID_Principles.S_part;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        List<Object> shapes = List.of(circle, square);
        int sum = areaCalculator.sum(shapes);
        System.out.println(areaCalculator.json(shapes));
        System.out.println(areaCalculator.csv(shapes));
    }
}
