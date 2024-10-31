package Homework;

public class FallingBall {
    public static void main(String[] args) {
        float height = 100;
        float s = height;
        for (int i = 1; i < 10; i++) {
            s += height;
            height /= 2;
        }
        System.out.println("The total length: " + s);
        System.out.println("The height after 10 fall: " + height);
    }
}
