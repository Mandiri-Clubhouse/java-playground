package com.mandiri.clubhouse.excercisetwo;

public class Rectangle extends Shape {
    private Double length;
    private Double width;

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    protected Double getArea() {
        return length * width;
    }

    @Override
    protected Double getPerimeter() {
        return 2 * (length + width);
    }
}
