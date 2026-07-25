interface Shape {
    double calculateArea();
}
class Circle implements Shape {
    double radius;
    Circle(double radius) { this.radius = radius; }
    public double calculateArea() { return Math.PI * radius * radius; }
}
class Rectangle implements Shape {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double calculateArea() { return length * width; }
}
class Triangle implements Shape {
    double base, height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double calculateArea() { return 0.5 * base * height; }
}
public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);
        Triangle t = new Triangle(3, 8);
        System.out.println("----- Shape Area Calculator -----");
        System.out.println("Circle:");
        System.out.println("Radius = " + c.radius);
        System.out.println("Area of Circle = " + c.calculateArea());
        System.out.println("\nRectangle:");
        System.out.println("Length = " + r.length + ", Width = " + r.width);
        System.out.println("Area of Rectangle = " + r.calculateArea());
        System.out.println("\nTriangle:");
        System.out.println("Base = " + t.base + ", Height = " + t.height);
        System.out.println("Area of Triangle = " + t.calculateArea());
    }
}
