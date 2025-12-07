package com.jdc;

public class ShapeTest {

    public static void main(String[] args) {
        Shape shape = new Shape(10,20);
        System.out.println("Shape's width; "+ shape.width);
        System.out.println("Shape's height; "+ shape.height);
        System.out.println("Shape's area; " + shape.getArea());
    }
}
