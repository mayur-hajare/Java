package com.mh;

import java.util.Scanner;

public class EncryptDecryptGrade {
    public static void main(String[] args) {

        //W.A.P to encrypt a grade by adding 8 to it. Decrypt it to show the correct Grade.

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Your Grade : ");
        char grade=scanner.next().charAt(0);
        grade= (char) (grade+8);
        System.out.println("Encrypted Grade is : "+grade);
        grade= (char) (grade-8);
        System.out.println("Decrypted Grade is : "+grade);


    }
}

