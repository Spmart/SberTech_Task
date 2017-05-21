package shapes;

public class Triangle {
    private double base; //основание треугольника
    private double height; //высота треугольника, проведенная к основанию
    private double firstSide; //сторона
    private double secondSide; //еще одна сторона

    public Triangle(double base, double height, double firstSide, double secondSide) {
        this.base = base;
        this.height = height;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getArea() {
        double area = 0.5 * base * height;
        return area;
    }

    public double getPerimeter() {
        double perimeter = base + firstSide + secondSide;
        return perimeter;
    }
}
