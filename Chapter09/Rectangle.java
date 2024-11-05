package odevler.chapter02.Chapter09;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        width = 1;
        height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        System.out.println("The width of the first rectangle is " + r1.getWidth());
        System.out.println("The height of the first rectangle is " + r1.getHeight());
        System.out.println("The area of the first rectangle is " + r1.getArea());
        System.out.println("The perimeter of the first rectangle is " + r1.getPerimeter());
        System.out.println("The width of the second rectangle is " + r2.getWidth());
        System.out.println("The height of the second rectangle is " + r2.getHeight());
        System.out.println("The area of the second rectangle is " + r2.getArea());
        System.out.println("The perimeter of the second rectangle is " + r2.getPerimeter());
    }
}