package com.mandiri.clubhouse.excercisetwo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(7.0);
        Rectangle rectangle = new Rectangle(5.0, 7.0);
        Triangle triangle = new Triangle(3.0, 6.0);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(triangle);

        System.out.println("total area all shapes is : "+calculateAllArea(shapes));
    }

    private static double calculateAllArea(List<Shape> shapes) {
        var sum = 0.0;
        for (Shape s: shapes) {
            sum += s.getArea();
        }
        return sum;
    }
}
