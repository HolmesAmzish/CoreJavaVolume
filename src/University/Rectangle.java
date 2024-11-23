package University;

import org.junit.Test;

public class Rectangle {
    protected float width;
    protected float height;
    public Rectangle() {
        this.width = 10;
        this.height = 10;
    }
    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getArea() {
        return width * height;
    }
    public float getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20, 30);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}
