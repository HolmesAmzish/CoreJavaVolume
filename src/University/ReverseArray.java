package University;

import java.util.Stack;

/**
 * Output a reversed array
 * @version 1.0 2024-09-29
 * @author cacc
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        var stack = new Stack<Integer>();

        for (int number : arr) {
            stack.push(number);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}
