package com.mh;

import javax.xml.crypto.dsig.CanonicalizationMethod;
import java.util.Scanner;

class Coustomer {
    public void C_details() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***** Welcome To Store *****");
        System.out.println("Please Enter Your Details");

        int c_id;
        String c_name;
        long ph_no;
        String address;
        int type;
        System.out.print("Enter Your ID : ");
        c_id = scanner.nextInt();
        System.out.print("Enter Your Name : ");
        c_name = scanner.next();
        System.out.print("Enter your Phone Number : ");
        ph_no = scanner.nextInt();
        System.out.print("Enter your Address  : ");
        address = scanner.next();
        System.out.print("Enter Your Type :");
        type = scanner.nextInt();

        int amount = 0;

        System.out.println("1.Pizza     -150");
        System.out.println("2.Burgarr   -50");
        System.out.println("3.PaniPure  -20");
        System.out.println("4.Sandwich  -40");

        System.out.print("Please Select Your Order : ");
        int order = scanner.nextInt();
        if (order == 1)
            amount = 150;
        else if (order == 2)
            amount = 50;
        else if (order == 3)
            amount = 20;
        else if (order == 4)
            amount = 40;
        else
            amount = 0;

        if (type == 1) {
            System.out.println("Your A Premium Member You Got 10% Discount");
            System.out.println(amount * 10 / 100);
        } else if (type == 2) {
            System.out.println("Your A Regular Member You Got 5% Discount");
            System.out.println(amount * 5 / 100);
        } else {
            System.out.println("Your A Guest Member You Got 2% Discount");
            System.out.println(amount * 2 / 100);
        }

    }
}


//class Foods {
//     public int order(int C_type) {
//         Scanner scanner = new Scanner(System.in);
//        /* int amount=0;
//
//         System.out.println("1.Pizza     -150");
//         System.out.println("2.Burgarr   -50");
//         System.out.println("3.PaniPure  -20");
//         System.out.println("4.Sandwich  -40");
//
//         System.out.println("Please Select Your Order : ");
//         int order=scanner.nextInt();
//         if (order==1)
//             amount=150;
//         else if (order==2)
//             amount=50;
//         else if (order==3)
//             amount=20;
//         else if (order==4)
//             amount=40;
//         else
//             amount=0;
//
//         if (C_type==1)
//             return amount/10;
//        else if (C_type==2)
//            return amount/5;
//        else
//            return amount/2;*/
//
//     }


public class Food {
    public static void main(String[] args) {

        Coustomer coustomer = new Coustomer();
        coustomer.C_details();

/*
        Foods obj=new Foods();
        obj.order()
*/
    }

}
