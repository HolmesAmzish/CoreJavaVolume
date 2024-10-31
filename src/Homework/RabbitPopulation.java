package Homework;

import java.util.Scanner;

/**
 * RabbitPopulation
 * @version 1.0 2024-10-22
 *
 */
public class RabbitPopulation {
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the max month: ");
        int max = sc.nextInt();
        int RabbitPopulation = 0;
        for (int i = 1; i <= max; i++) {
            RabbitPopulation = fibonacci(i);
            System.out.println("RabbitPopulation: " + RabbitPopulation);
        }
    }
}
