package Figures;

public class Pentagon extends Figure {
    private double side; // Длина стороны пятиугольника

    // Конструктор для пятиугольника
    public Pentagon(double side) {
        this.side = side;
    }

    // Реализация метода для вычисления площади
    @Override
    public double getArea() {
        // Площадь пятиугольника: (5 * side^2) / (4 * tan(π/5))
        return (5 * side * side) / (4 * Math.tan(Math.PI / 5));
    }

    // Реализация метода для вычисления периметра
    @Override
    public double getPerimeter() {
        // Периметр пятиугольника: 5 * side
        return 5 * side;
    }
}
