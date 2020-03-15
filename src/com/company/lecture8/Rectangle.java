package com.company.lecture8;

public class Rectangle implements Figure{
    private double width;
    private double height;
    String name = "Rectangle";
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea(){
        double area = width * height;
        return area;
    }
    @Override
    public String getName(){
        return this.name;
    }

}
