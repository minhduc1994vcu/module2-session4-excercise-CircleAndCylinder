package com.codegym.circleAndCylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        height = 1;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + super.getRadius() +
                ", color='" + super.getColor() +
                '}' + " which is subclass of " + super.toString();
    }
}
