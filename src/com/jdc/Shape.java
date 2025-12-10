package com.jdc;

public class Shape  {

    protected double height;
    protected double width;

    public Shape(double w, double h) {
        this.width = w;
        this.height = h;
    }

    protected double getArea() {
        return width*height;
    }

}
