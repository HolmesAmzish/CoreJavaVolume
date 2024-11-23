package University;

/**
 * Find the factorial with recursion
 * @version 1.0 2024-10-14
 * @author Holmes Amzish
 */
public class Factorial {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("The factorial of 4 is: " + findFactorial(n));
        System.out.println("The factorial of 4 is(Loop): " + findFactorialByLoop(4));
    }

    public static int findFactorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * findFactorial(n - 1);
        }
    }

    public static int findFactorialByLoop(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
