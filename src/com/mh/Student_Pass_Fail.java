package com.mh;

import java.util.Scanner;

public class Student_Pass_Fail {
    public static void main(String[] args) {
        System.out.print("Enter marks of MATH | Science | English :");
        Scanner scanner = new Scanner(System.in);
        float math = scanner.nextFloat();
        float science = scanner.nextFloat();
        float english = scanner.nextFloat();

        float sum = math + science + english;
        float total = 300;

        float per = sum / total * 100;

        float mathPer = math / 100 * 100;
        float sciPer = science / 100 * 100;
        float engPer = english / 100 * 100;

        System.out.println(per + " %");
        System.out.println(mathPer + " %");
        System.out.println(sciPer + " %");
        System.out.println(engPer + " %");

        if (per >= 40) {
            if (mathPer >= 33 && sciPer >= 33 && engPer >= 33) {
                System.out.println("Your Are Pass..!");
            }
        }
        if (per >= 40) {
            if (mathPer <= 33 || sciPer <= 33 || engPer <= 33) {
                System.out.println("Your Are Fail..!");
            }
        }
    }
}
