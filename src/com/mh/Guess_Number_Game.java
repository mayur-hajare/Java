package com.mh;

import java.util.Random;
import java.util.Scanner;

class Random_Number {
    Random random = new Random();
    int randNum = random.nextInt(1, 100);
    int var;

    public void GetUserInput() {
        System.out.println("Enter Your Guess Number : ");
        Scanner scanner = new Scanner(System.in);
        var = scanner.nextInt();
    }

    public int isCorrect() {
        if (randNum == var) {
            System.out.println(randNum);
            System.out.println("YOU WON..!");
            return 1;
        } else {
            System.out.println("LOSS");
            if (randNum > var) {
                System.out.println("You Entered Number Is Smaller..");
            } else {
                System.out.println("You Entered Number Is Grater..");
            }
            return 0;
        }
    }
}

public class Guess_Number_Game {
    public static void main(String[] args) {

        Random_Number rand = new Random_Number();
        // Boolean bool = true;
        int b;
        do {
            rand.GetUserInput();
            b = rand.isCorrect();
        } while (0 == b);


    }
}
