package com.mh;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {

        //pattern
/*
        for(int j=4;j>=1;j--){
            System.out.println("\n");
            for (int i=1;i<=j;i++) {
                System.out.print(" * ");
            }

        }

        for(int j=1;j<=4;j++){
            System.out.println("\n");
            for (int i=4;i>=j;i--) {
                System.out.print(" * ");
            }


       }*/

/*
        //sum  of even numbers
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int n=scanner.nextInt();
        int sum = 0;
        int j=0;
        while(j<=n) {
            if (j % 2 == 0) {
                sum = sum + j;
            }
            j++;
        }
        System.out.println(sum);
        */

        //Multiplication of given number
/*

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int n = scanner.nextInt();

        for (int i = 10; i >= 1; i--) {

            System.out.println(n + " * " + i + " = " + n * i);
        }
*/

     /*   //Factorial of given Number
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any Number : ");
        int n = scanner.nextInt();
        double fact = 1;
        for (int i = 1; i <= n; i++) {

            fact = fact * i;

        }
        System.out.println(fact);
*/

        //sum of number occurring in table

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Number :");
        int n = scanner.nextInt();

        int i = 1, sum = 0, a;
        while (i <= 10) {
            a = n * i;
            sum = sum + a;
            System.out.println(n + " * " + i + " = " + a);
            i++;
        }
        System.out.println("sum of multiplication : " + sum);

    }
}
