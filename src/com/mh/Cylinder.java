package com.mh;


import java.util.Scanner;

class Area_Cylinder {
    int height, radius;

    public void setDiameters() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Height : ");
        height = scanner.nextInt();
        System.out.print("Enter Radius : ");
        radius = scanner.nextInt();
    }

    public double Area() {
        return 3.14 * radius * radius * height;

    }


}

public class Cylinder {
    public static void main(String[] args) {


        Area_Cylinder cylinder = new Area_Cylinder();
        cylinder.setDiameters();
        System.out.println("Volume Of Cylinder is : " + cylinder.Area());


    }
}
