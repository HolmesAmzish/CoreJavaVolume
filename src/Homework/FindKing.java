package Homework;

import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

public class FindKing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of monkeys: ");
        int n = sc.nextInt();
        int king = findMonkeyKing(n);
        System.out.println("The king is: " + king);
    }
    public static int findMonkeyKing(int n) {
        List<Integer> monkeys = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            monkeys.add(i);
        }
        int index = 0;
        while (monkeys.size() > 1) {
            index = (index + 2) % monkeys.size();
            monkeys.remove(index);
        }
        return monkeys.getFirst();
    }
}
