package com.anagraceTech.SOLID_Principles;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Shape circle = new Circle(10);
        Shape square = new Square(10);
        Shape cube = new Cube();
        //NoShape noShape = new NoShape();
        List<Shape> shapes = List.of(circle, square, cube);
        ShapesPrinter printer = new ShapesPrinter();
        int sum = areaCalculator.sum(shapes);
        System.out.println(printer.json(sum));
        System.out.println(printer.csv(sum));
    }
}
