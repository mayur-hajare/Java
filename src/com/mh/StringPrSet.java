package com.mh;

import java.util.Scanner;

public class StringPrSet {
    public static void main(String[] args) {

        // string to lower case
        String str = "MAYUR";
        str = str.toLowerCase();
        System.out.println(str);

        // replace whitespaces to underscore

        String str1 = "Hello Good Morning..!";
        str1 = str1.replace(' ', '_');
        System.out.println(str1);

        // Fill in a letter template
        // Dear, <Name> Thanks A lot...!

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String str2 = scanner.next();
        System.out.print("Dear, " + str2 + " Thanks A lot..!");

        // Find out the double and triple space from string

        String str3 = "Find out the double and triple  space from   string";
        System.out.println(str3.indexOf("  "));
        System.out.println(str3.indexOf("   "));

        // Escape Sequence Character

        String str4 = "Hello Mayur,\n\t Have A Good Day..!";
        System.out.println(str4);


    }
}
