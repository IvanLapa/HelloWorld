package com.company.lecture8;

public class Main {


public static void main (String[]args){
    Circle circle = new Circle(24);
    circle.getArea();
    Rectangle rectangle = new Rectangle(20, 20);
    rectangle.getArea();

        if (circle.getArea() == rectangle.getArea()) {
            System.out.println("true");
        } else {
            System.out.println("faulse");
        }

}

}