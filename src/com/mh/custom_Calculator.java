package com.mh;

import javax.xml.stream.StreamFilter;
import java.awt.*;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.Spliterator;

class AddException extends Exception {
    public String toString() {

        return "Number Should be Positive";
    }
}

class DivException extends Exception {
    public String toString() {
        return "Can not divided by zero";
    }
}

class MulException extends Exception {
    public String toString() {
        return "You can not multiply by 7000";
    }
}

class Cal {
    public Cal(int a, int b, int c) throws AddException, DivException, MulException {
        if (c == 1) {
            this.add(a, b);
        } else if (c == 2) {
            this.sub(a, b);
        } else if (c == 3) {
            this.mul(a, b);
        } else {
            this.div(a, b);
        }
    }

    public void add(int a, int b) throws AddException {
        if (a < 0 && b < 0) {
            throw new AddException();
        }
        System.out.println(a + b);


    }


    public void sub(int a, int b) {
        System.out.println(a - b);
    }

    public void mul(int a, int b) throws MulException {
        if (b >= 7000) {
            throw new MulException();
        }
        System.out.println(a * b);

    }

    public void div(int a, int b) throws DivException {
        if (b == 0) {
            throw new DivException();
        }
        System.out.println(a / b);

    }
}

public class custom_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Add \n 2. Sub \n 3. Mul \n 4.Div");
        System.out.println("Enter Your Choice :");
        int Choice = scanner.nextInt();
        try {
            Cal cal = new Cal(5, 80, Choice);
        } catch (AddException e) {
            e.printStackTrace();
        } catch (DivException e) {
            e.printStackTrace();
        } catch (MulException e) {
            e.printStackTrace();
        }

    }

}
