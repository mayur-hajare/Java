package com.mh;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        /*//print reverse array
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }*/

        // 2D array
/*
        int[][] flats;
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        for (int i = 0; flats.length > i; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j] + " ");
            }
            System.out.println("\n");

        }*/

        // create an array and calculate sum of array elements
/*
        int[] arr = {10, 15, 20, 30, 50};
        int sum=0;
        for (int element : arr) {
             sum = (sum + element);
        }
        System.out.println(sum);*/
/*

        int sum = 0;

        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.println(sum);
*/

  /*      //find given number present in array or not

        int a[] = new int[5];

        System.out.print("Enter Any 5 Numbers : ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.print("Enter Number to find in array : ");
        int find = scanner.nextInt();

        for (int i = 0; i < 5; i++) {
            if (a[i] == find)
                System.out.print(find + " is present in array at " + i);
        }

       *//* for (int i=0;i<5;i++){

            System.out.println(a[i]);
        }
*//*
         */
        /*// Calculate average of marks from given array
        Scanner scanner = new Scanner(System.in);
        int marks[] = new int[5];
        int sum = 0, avg = 0;

        for (int j = 0; j < 5; j++) {
            System.out.print("Enter Marks of Students " + j + " :");
            marks[j] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            sum = sum + marks[i];
            avg = sum / 5;


        }
        System.out.println("Average of Students Marks  : " + avg + " %");
        */

        // Addition of 2 matrix

        int a[][] = {{10, 91, 50}, {54, 56, 98}};
        int b[][] = {{45, 56, 86}, {54, 65, 89}};
        int sum[][] = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.println(sum[i][j]);

            }
        }
        System.out.println("");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println("");
        }

        System.out.println("    + ");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j] + " ");

            }
            System.out.println(" ");
        }

        System.out.println("    = ");


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + " ");

            }
            System.out.println("");
        }

    }
}
