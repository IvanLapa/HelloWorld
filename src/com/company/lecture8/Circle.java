package com.company.lecture8;

public class Circle implements Figure{
    private double radius;
    String name = "Circle";
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        double area = (radius * radius)* Math.PI;
        return area;
    }
    @Override
    public String getName(){
        return this.name;
    }
}
