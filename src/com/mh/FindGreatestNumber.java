package com.mh;

import java.util.Scanner;

public class FindGreatestNumber {
    public static void main(String[] args) {

        //Use comparison operator to find out whether A is greater than user entered Number or not.

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int num=scanner.nextInt();

        int a =45;
        if(a>num){
            System.out.println("A="+a+" is Greater Than User Entered Number...");
        }else{
            System.out.println("A="+a+" is Lower Than User Entered Number...");
        }

    }
}
