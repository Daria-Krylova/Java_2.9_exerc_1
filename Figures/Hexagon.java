package Figures;

public class Hexagon extends Figure {
    private double side; // Длина стороны шестиугольника

    // Конструктор для шестиугольника
    public Hexagon(double side) {
        this.side = side;
    }

    // Реализация метода для вычисления площади
    @Override
    public double getArea() {
        // Площадь шестиугольника: (3 * sqrt(3) * side^2) / 2
        return (3 * Math.sqrt(3) * side * side) / 2;
    }

    // Реализация метода для вычисления периметра
    @Override
    public double getPerimeter() {
        // Периметр шестиугольника: 6 * side
        return 6 * side;
    }
}
