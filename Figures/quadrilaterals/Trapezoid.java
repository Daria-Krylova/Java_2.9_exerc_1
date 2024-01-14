package Figures.quadrilaterals; // Пакет для класса Trapezoid

// Класс Trapezoid, наследуется от Quadrilateral
public class Trapezoid extends Quadrilateral {
    private double height; // Высота трапеции

    // Конструктор для трапеции
    public Trapezoid(double a, double b, double c, double d, double height) {
        // a и b - длины параллельных сторон, c и d - длины непараллельных сторон
        super(a, b, c, d);
        this.height = height;
    }

    // Реализация метода для вычисления площади
    @Override
    public double getArea() {
        // Площадь трапеции равна полусумме длин параллельных сторон, умноженной на высоту
        return (a + b) / 2 * height;
    }

    // Переопределение метода для вычисления периметра
    @Override
    public double getPerimeter() {
        // Периметр трапеции - это сумма всех её сторон
        return a + b + c + d;
    }
}
