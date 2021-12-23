package com.mh;

class Circle {
    int r;

    Circle(int a) {
        r = a;
        System.out.println("Circle Area is : " + Math.PI * r * r);
    }
}

class Cylinder1 extends Circle {
    int height;

    Cylinder1(int a, int b) {
        super(b);
        height = a;
        System.out.println("Volume Of Cylinder is :" + height * Math.PI * r * r);

    }
}

class Rectangle {
    int length, breadth;

    public Rectangle(int l, int b) {

        length = l;
        breadth = b;
    }

    public void Area(int a, int b) {
        System.out.println("Area of Rectangle is  :" + length * breadth);
    }
}

class Cuboid extends Rectangle {
    int height;

    public Cuboid(int height, int length, int breadth) {
        super(length, breadth);
        this.height = height;
        System.out.println("Area of Cuboid is : " + length * breadth * height);
    }
}

public class Inheritance_Pr {
    public static void main(String[] args) {
        Cylinder1 cylinder1 = new Cylinder1(12, 5);
        Cuboid cuboid = new Cuboid(12, 5, 8);
        cuboid.Area(5, 8);

    }
}
