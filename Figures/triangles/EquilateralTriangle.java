package Figures.triangles; // Пакет для класса EquilateralTriangle

// Класс EquilateralTriangle, наследуется от Triangle
public class EquilateralTriangle extends Triangle {

    // Конструктор для равностороннего треугольника
    public EquilateralTriangle(double side) {
        // Все стороны равностороннего треугольника равны
        super(side, side, side);
    }

    // Реализация метода для вычисления площади
    @Override
    public double getArea() {
        // Площадь равностороннего треугольника: (sqrt(3) / 4) * side^2
        return (Math.sqrt(3) / 4) * a * a;
    }

    // Переопределение метода для вычисления периметра
    @Override
    public double getPerimeter() {
        // Периметр равностороннего треугольника: 3 * side
        return 3 * a;
    }
}
