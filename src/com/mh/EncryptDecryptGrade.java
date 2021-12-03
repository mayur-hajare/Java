package com.mh;

import java.util.Scanner;

public class EncryptDecryptGrade {
    public static void main(String[] args) {

        //W.A.P to encrypt a grade by adding 8 to it. Decrypt it to show the correct Grade.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Your Grade : ");
        float grade=scanner.nextFloat();
        grade=grade+8;
        System.out.println("Encrypted Grade is : "+grade);
        grade=grade-8;
        System.out.println("Decrypted Grade is : "+grade);


    }
}

