package org.example;

import java.util.Arrays;

public class Elements100 {

    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * 100 - 50);
        }
//        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (i % 3 == 0) {
                System.out.print(" Fizz");
            }
            if (i % 5 == 0) {
                System.out.print(" Buzz");
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(" FizzBuzz ");
            } else
                System.out.print(" "+ array[i]);
        }
    }
}

