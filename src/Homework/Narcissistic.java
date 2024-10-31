package Homework;

/**
 * Assignment 4
 * Find the narcissistic numbers
 * @version 1.0 2024-10-31
 * @author Holmes Amzish
 */
public class Narcissistic {
    public static void main(String[] args) {
        System.out.println("The narcissistic numbers:");

        for (int number = 100; number < 1000; number++) {
            int hundreds = number / 100;
            int tens = (number / 10) % 10;
            int units = number % 10;

            if (Math.pow(hundreds, 3) + Math.pow(tens, 3) + Math.pow(units, 3) == number) {
                System.out.println(number);
            }
        }
    }
}
