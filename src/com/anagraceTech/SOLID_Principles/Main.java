package com.anagraceTech.SOLID_Principles;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        IAreaCalculator areaCalculator = new AreaCalculator();
        Shape circle = new Circle(10);
        Shape square = new Square(10);
        Shape cube = new Cube();
        //NoShape noShape = new NoShape();
        List<Shape> shapes = List.of(circle, square, cube);
        ShapesPrinter printer = new ShapesPrinter(areaCalculator);
        int sum = areaCalculator.sum(shapes);
        System.out.println(printer.json(shapes));
        System.out.println(printer.csv(shapes));
    }
}
