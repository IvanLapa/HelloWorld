package com.companyJD1.lecture8_inner;

import static java.lang.Math.sqrt;

public class Rectangle implements Shape {
    private double a, b;

    protected Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    public double getSquare() {
        return a * b;
    }


    protected double getDiagonal() {
        return sqrt(a * a + b * b);
    }

    @Override
    public boolean compareSquare(Shape shape) {
        return getSquare() == shape.getSquare();
    }

    @Override
    public String toString() {
        return "Прямоугольник со сторонами " + this.a + " и " + this.b + "\n Площадь прямоугольника= " + getSquare() + "\nПериметр прямоугольника=" + getPerimeter();
    }


    static class Cylinder {
        private double R, H;

        protected Cylinder(double R, double H) {
            this.R = R;
            this.H = H;
        }

        protected double getSquare() {
            return 2 * PI * R * (H + R);
        }

        protected double getVolume() {
            return PI * R * R * H;
        }

        public boolean compareSquare(Shape shape) {
            return getSquare() == shape.getSquare();
        }

        @Override
        public String toString() {
            return "Цилиндр с раудиусом " + this.R + " и высотой " + this.H + "\n Площадь цилиндра= " + getSquare() + "\nОбъём цилиндра=" + getVolume();
        }
    }
}
