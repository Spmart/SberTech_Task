import shapes.*;
import formula.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(15);
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Длина окружности: " + circle.getLength());

        Rectangle rectangle = new Rectangle(10, 15);
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
        System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());

        Triangle triangle = new Triangle(6, 4, 5, 5);
        System.out.println("Площадь треугольника: " + triangle.getArea());
        System.out.println("Периметр треугольника: " + triangle.getPerimeter());

        System.out.println("Введите формулу:");
        Scanner in = new Scanner(System.in);
        String formula = in.nextLine();

        double calcResult = 0.0;
        Calculator calculator = new Calculator();
        try {
            calcResult = calculator.Calc(formula);
            System.out.println("Результат:");
        }
        catch (javax.script.ScriptException e) {
            System.out.println("Кажется, вы напортачили с форматом формулы... Рассчет не произведен");
        }
        System.out.println(calcResult);
    }
}
