package com.companyJD1.lecture8_inner;

public class ShapeUtils {
    private ShapeUtils() {

    }

    protected static boolean isRectangle(Shape shape) {
        return shape instanceof Rectangle;
    }

    protected static boolean isTriangle(Shape shape) {
        return shape instanceof Triangle;
    }

}
