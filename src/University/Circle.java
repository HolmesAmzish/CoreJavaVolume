package University;

import static java.lang.Math.round;

/**
 * Circle
 * @version 1.0 2024-11-18
 * @author Holmes Amzish
 */
public class Circle {
    private double radius;

    Circle() {
        this.radius = 0.0;
    }

    // Constructor overloading
    Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void show() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }

    public static void main(String[] args) {
        Circle circle = new Circle(4);
        circle.show();
    }
}
