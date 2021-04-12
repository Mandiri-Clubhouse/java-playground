package com.mandiri.clubhouse.excercisetwo;

public class Circle extends Shape {
    private Double radius;
    private static Double phi = 3.14;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    protected Double getArea() {
        return phi * radius * radius;
    }

    @Override
    protected Double getPerimeter() {
        return 2 * phi * radius;
    }
}

