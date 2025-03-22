package app;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Triangle;
import utils.GeometryUtils;


public class GeometryApp {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в GeometryApp!");

        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(8, 5);
        Triangle triangle = new Triangle(6, 7, 8);

        printInfo("Круг", circle.getArea(), circle.getPerimeter(), circle.getDiameter());
        printInfo("Прямоугольник", rectangle.getArea(), rectangle.getPerimeter());
        printInfo("Треугольник", triangle.getArea(), triangle.getPerimeter());
        printCm2ToM2(1000.00);

    }

    private static void printInfo(String figure, double area, double perimeter) {
        System.out.println("Фигура: " + figure);
        System.out.printf("  Площадь: %.2f\n", area);
        System.out.printf("  Периметр: %.2f\n", perimeter);
        System.out.println("----------------------------");
    }

    private static void printInfo(String figure, double area, double perimeter, double diameter) {
        System.out.println("Фигура: " + figure);
        System.out.printf("  Площадь: %.2f\n", area);
        System.out.printf("  Периметр: %.2f\n", perimeter);
        System.out.printf("  Диаметр: %.2f\n", diameter);
        System.out.println("----------------------------");
    }

    private static void printCm2ToM2(double cm2) {
        System.out.println(cm2 + " см кв."  + " = " + GeometryUtils.cm2ToM2(cm2) + " м кв.");
        System.out.println("----------------------------");
    }
}
