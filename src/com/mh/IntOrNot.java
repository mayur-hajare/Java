package com.mh;

import java.util.Scanner;

public class IntOrNot {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        boolean num=scanner.hasNextInt();
        if (num){
            System.out.println("Enter Number is Integer.");
        }else{
            System.out.println("Enter Number is Not Integer.");
        }
    }
}
