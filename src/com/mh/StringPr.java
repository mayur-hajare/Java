package com.mh;

import java.util.Scanner;

public class StringPr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Upper case to lowercase
        //Run one by one

        String str;
        System.out.print("Enter Your String :");
        str = scanner.nextLine();
        System.out.println(str.toLowerCase());

        //Replace space with underscore

/*
        String str1;
        System.out.print("Enter Your String :");
        str1 = scanner.nextLine();
        System.out.println(str1.replace(' ', '_'));
*/


        //Replace the name with entered name

/*
        String str2 = "Dear name Thanks a lot..!";
        System.out.print("Enter Your Name :");
        String name = str2.replace("name", scanner.next());
        System.out.println(name);


*/

        //Find Double and triple Space in String

/*

        String str3;
        System.out.print("Enter your String :");
        str3 = scanner.nextLine();
        System.out.println("Double space available at :" + str3.indexOf("  "));
        System.out.println("Triple Space available at :" + str3.indexOf("   "));
*/


    }

}
