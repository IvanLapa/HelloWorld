package com.companyJD1.lecture8_inner;

public class Main {

public static void main (String[]args){
    Triangle triangle = new Triangle(3, 4, 5);
    Romb romb = new Romb(2, 3);
    Circle circle = new Circle(10);
    Square square = new Square(8);
    Rectangle rectangle = new Rectangle(2, 6);
    System.out.println(ShapeUtils.isRectangle(rectangle));
    Circle.Sphere sphere = new Circle.Sphere(10);
    System.out.println(rectangle.toString());
    System.out.println(triangle.toString());
    System.out.println(circle.compareSquare(triangle));
    }
}