package Homework;

/**
 * Find the factorial with recursion
 * @version 1.0 2024-10-14
 * @author Holmes Amzish
 */
public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("The factorial of 5 is: " + findFactorial(n));
    }

    public static int findFactorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * findFactorial(n - 1);
        }
    }
}
