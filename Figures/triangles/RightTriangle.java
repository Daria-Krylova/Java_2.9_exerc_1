package Figures.triangles; // Пакет для класса RightTriangle

// Класс RightTriangle, наследуется от Triangle
public class RightTriangle extends Triangle {
    private double base;   // Длина основания (одного из катетов)
    private double height; // Высота (другого катета)

    // Конструктор для прямоугольного треугольника
    public RightTriangle(double base, double height) {
        // Инициализация сторон треугольника
        super(base, height, Math.sqrt(base * base + height * height)); // Вызов конструктора базового класса Triangle
        this.base = base;        // Инициализация длины основания
        this.height = height;    // Инициализация высоты
    }

    // Реализация метода для вычисления площади
    @Override
    public double getArea() {
        // Площадь прямоугольного треугольника: 0.5 * base * height
        return 0.5 * base * height;
    }

    // Переопределение метода для вычисления периметра
    @Override
    public double getPerimeter() {
        // Периметр прямоугольного треугольника: сумма длин трех сторон
        return a + b + c;
    }
}
