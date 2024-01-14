package Figures;
import Figures.quadrilaterals.*;
import Figures.triangles.EquilateralTriangle;
import Figures.triangles.IsoscelesTriangle;
import Figures.triangles.RightTriangle;


public class Main {
    public static void main(String[] args) {
        // Создание и тестирование различных фигур

        // Треугольники
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(5);
        System.out.println("Equilateral Triangle Area: " + equilateralTriangle.getArea());
        System.out.println("Equilateral Triangle Perimeter: " + equilateralTriangle.getPerimeter());

        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(6, 4, 3);
        System.out.println("Isosceles Triangle Area: " + isoscelesTriangle.getArea());
        System.out.println("Isosceles Triangle Perimeter: " + isoscelesTriangle.getPerimeter());

        RightTriangle rightTriangle = new RightTriangle(3, 4);
        System.out.println("Right Triangle Area: " + rightTriangle.getArea());
        System.out.println("Right Triangle Perimeter: " + rightTriangle.getPerimeter());

        // Четырёхугольники
        Square square = new Square(4);
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Perimeter: " + square.getPerimeter());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        Rhombus rhombus = new Rhombus(4, 5, 6);
        System.out.println("Rhombus Area: " + rhombus.getArea());
        System.out.println("Rhombus Perimeter: " + rhombus.getPerimeter());

        Trapezoid trapezoid = new Trapezoid(4, 6, 3, 3, 2);
        System.out.println("Trapezoid Area: " + trapezoid.getArea());
        System.out.println("Trapezoid Perimeter: " + trapezoid.getPerimeter());

        // Другие фигуры
        Pentagon pentagon = new Pentagon(5);
        System.out.println("Pentagon Area: " + pentagon.getArea());
        System.out.println("Pentagon Perimeter: " + pentagon.getPerimeter());

        Hexagon hexagon = new Hexagon(6);
        System.out.println("Hexagon Area: " + hexagon.getArea());
        System.out.println("Hexagon Perimeter: " + hexagon.getPerimeter());

        Oval oval = new Oval(5, 3);
        System.out.println("Oval Area: " + oval.getArea());
        System.out.println("Oval Perimeter: " + oval.getPerimeter());

        Circle circle = new Circle(4);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
    }
}
