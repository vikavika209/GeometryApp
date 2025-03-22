package app;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Triangle;
import utils.GeometryUtils;
import threedim.Cube;
import threedim.Sphere;


public class GeometryApp {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в GeometryApp!");

        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(8, 5);
        Triangle triangle = new Triangle(6, 7, 8);
        Cube cube = new Cube(5);
        Sphere sphere = new Sphere(3);

        printInfo("Круг", circle.getArea(), circle.getPerimeter(), circle.getDiameter());
        printInfo("Прямоугольник", rectangle.getArea(), rectangle.getPerimeter());
        printInfo("Треугольник", triangle.getArea(), triangle.getPerimeter());
        printCm2ToM2(1000.00);
        printCompareAreas(200, 200);
        printInfo("Куб", cube.getSurfaceArea());
        printInfo("Сфера", sphere.getSurfaceArea());

        cube.toString();
        sphere.toString();

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

    private static void printInfo (String figure, double area) {
        System.out.println("Фигура: " + figure);
        System.out.printf("  Площадь: %.2f\n", area);
        System.out.println("----------------------------");
    }

    private static void printCompareAreas(double area1, double area2){
        if (GeometryUtils.compareAreas(area1, area2) == -1){
            System.out.println("Площадь первой фигуры меньше площади второй фигуры");
            System.out.println("----------------------------");
        }else if(GeometryUtils.compareAreas(area1, area2) == 1){
            System.out.println("Площадь первой фигуры больше площади второй фигуры");
            System.out.println("----------------------------");
        }else {
            System.out.println("Площадь фигур равны");
            System.out.println("----------------------------");
        }
    }
}
