package com.codegym.circleAndCylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);

        Cylinder cylinder2 = new Cylinder(5, "purple", 3.5);
        System.out.println(cylinder2);
        cylinder1.setColor("yellow");
        System.out.println(cylinder1);
//        Circle test = new Cylinder();
//        System.out.println(test.getColor());
//        System.out.println( ((Cylinder)test).getVolume());
    }
}

