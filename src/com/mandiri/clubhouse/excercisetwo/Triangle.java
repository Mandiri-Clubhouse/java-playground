package com.mandiri.clubhouse.excercisetwo;

public class Triangle extends Shape {
    private Double length;
    private Double width;

    public Triangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    protected Double getArea() {
        return length + width + 2.0;
    }

    @Override
    protected Double getPerimeter() {
        return null;
    }
}
