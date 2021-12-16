package com.mh;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_scissors_Game {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("**** Rock Paper Scissors ****");

        System.out.print("Enter Your Name :");
        String name = scanner.next();

        int i = 1;
        int pc = 0;
        int you = 0;
        int choice = 0;


        while (i <= 5) {
            System.out.println("_________________________________");
            System.out.println("Round - " + i);
            System.out.println("Pc :" + pc);
            System.out.println(name + " :" + you);

            System.out.println("---------------------");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.println("---------------------");
            System.out.print("Select Option :");
            choice = scanner.nextInt();
            System.out.println("________________________________");


            Random rd = new Random();
            int randomNum = rd.nextInt(1, 3);

            if (randomNum == choice) {
                System.out.println("Match Tie.");
            } else if (randomNum == 1 && choice == 2) {
                System.out.println("You win.");
                you++;
            } else if (randomNum == 1 && choice == 3) {
                System.out.println("You Loss.");
                pc++;
            } else if (randomNum == 2 && choice == 1) {
                System.out.println("you Loss.");
                pc++;
            } else if (randomNum == 2 && choice == 3) {
                System.out.println("You Win.");
                you++;
            } else if (randomNum == 3 && choice == 1) {
                System.out.println("You Loss.");
                pc++;
            } else if (randomNum == 3 && choice == 2) {
                System.out.println("You Win.");
                you++;
            } else {
                System.out.println("Restart");
            }
            i++;

        }
        if (you < pc) {
            System.out.println("\n***** PC Win By : " + pc + " *****");
        } else {
            System.out.println("\n***** " + name + " Win By : " + you + " *****");
        }

    }
}
