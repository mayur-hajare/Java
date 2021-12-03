package com.mh;

import java.util.Scanner;

public class StudentPercentage {

    public static void main(String[] args) {
        float sub1,sub2,sub3,sub4,sub5;
        float per;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter % subjects Marks : ");
        sub1=scanner.nextInt();
        sub2=scanner.nextInt();
        sub3=scanner.nextInt();
        sub4=scanner.nextInt();
        sub5=scanner.nextInt();
        float obtain = sub1+sub2+sub3+sub4+sub5;
        float total=500;
        per=(obtain/total)*100;
        System.out.println(per);

    }
}
