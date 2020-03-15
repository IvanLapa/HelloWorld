package com.company.lecture8;

public class Square implements Figure {private double side;
    String name = "Square";
    Square(double side) {
        this.side = side;
    }
    @Override
    public double getArea(){
        double area = side * side;
        return area;
    }
    @Override
    public String getName(){
        return this.name;
    }
}
