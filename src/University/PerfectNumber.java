package University;

import java.util.Scanner;
import java.lang.Math;

/**
 * Assignment 4
 * @version 1.0 2024-10-31
 * @author Holmes Amzish
 */
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < Math.sqrt(num) + 1; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.printf("%d is a perfect number\n", num);
        } else {
            System.out.printf("%d is not a perfect number\n", num);
        }
    }
}
