package com;

import java.util.Scanner;

//TCS Question
public class TP {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Nny String :");
        str = sc.next();
        int i = 0;
        if (i < str.length())
            for (; i <= str.length() - 1; i++) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    System.out.println(str.charAt(i));
                }
                i = i + 2;

            }

    }
}
