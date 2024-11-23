package University;

import java.util.Scanner;

/**
 * Assignment 4
 * Find the palindromes between 10000 and 99999
 * @version 1.0 2024-10-31
 * @author Holmes Amzish
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num < 10000 || num > 99999) {
            System.out.println("Not a valid number");
        } else {
            if (num / 10000 == num % 10 && (num / 1000) % 10 == (num / 10) % 10) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a palindrome");
            }
        }
    }
}
