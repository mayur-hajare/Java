package com.shape;

import javax.crypto.spec.PSource;
import java.util.SortedMap;

class Rectangle {
    public void Volume(int l, int b, int h) {
        System.out.println("Volume of Rectangle :" + l * b * h);
    }
}

class Cir extends Rectangle {
    public void Volume(int r, int h) {
        System.out.println("Volume of circle :" + Math.PI * r * r * h);
    }
}

class Square extends Cir {
    public void volume(int l, int b) {
        System.out.println("Area of Square :" + l * b);
    }

}

class Sphere extends Square {
    public void Volume(int r) {
        System.out.println("Volume Of Sphere  :" + 4 / 3 * Math.PI * r * r * r);
    }

}

public class Shape {
    public static void main(String[] args) {

        Sphere sphere=new Sphere();
        sphere.Volume(20);
        sphere.Volume(20,5);
        sphere.Volume(20,15,6);
        sphere.Volume(20,2);
    }
}
