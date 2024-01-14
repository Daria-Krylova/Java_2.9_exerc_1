package Figures;

public class Circle extends Figure {
    private double radius; // Радиус круга

    // Конструктор для круга
    public Circle(double radius) {
        this.radius = radius;
    }

    // Реализация метода для вычисления площади круга
    @Override
    public double getArea() {
        // Площадь круга: π * r^2, где r - радиус
        return Math.PI * radius * radius;
    }

    // Реализация метода для вычисления периметра круга
    @Override
    public double getPerimeter() {
        // Периметр круга: 2 * π * r, где r - радиус
        return 2 * Math.PI * radius;
    }
}
