package shapes;

public class Circle {
    private static final double PI = 3.14159265359;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = PI * radius * radius;
        return area;
    }

    public double getLength() {
        double length = 2 * PI * radius;
        return length;
    }
}
