package Figures.triangles; // Пакет для класса IsoscelesTriangle

// Класс IsoscelesTriangle, наследуется от Triangle
public class IsoscelesTriangle extends Triangle {
    private double base;   // Длина основания равнобедренного треугольника
    private double height; // Высота, опущенная на основание

    // Конструктор для равнобедренного треугольника
    public IsoscelesTriangle(double base, double legs, double height) {
        super(legs, legs, base); // Вызов конструктора базового класса Triangle
        this.base = base;        // Инициализация длины основания
        this.height = height;    // Инициализация высоты
    }

    // Реализация метода для вычисления площади
    @Override
    public double getArea() {
        // Площадь равнобедренного треугольника: 0.5 * base * height
        return 0.5 * base * height;
    }

    // Переопределение метода для вычисления периметра
    @Override
    public double getPerimeter() {
        // Периметр равнобедренного треугольника: сумма длин двух равных сторон и основания
        return 2 * a + c;
    }
}
