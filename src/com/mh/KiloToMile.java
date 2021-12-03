package com.mh;

import java.util.Scanner;

public class KiloToMile {
    public static void main(String[] args) {
        System.out.print("Enter Kilometers :");
        Scanner scanner=new Scanner(System.in);
        float km=scanner.nextInt();

        double mile= km/1.609344;

        System.out.println(km +" km is equal to "+ mile + " miles");

    }
}
