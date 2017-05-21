package shapes;

public class Rectangle {
    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    public double getArea() {
        double area = firstSide * secondSide;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * firstSide + 2 * secondSide;
        return perimeter;
    }
}
