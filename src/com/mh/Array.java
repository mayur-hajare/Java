package com.mh;

public class Array {
    public static void main(String[] args) {

        //print reverse array
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
