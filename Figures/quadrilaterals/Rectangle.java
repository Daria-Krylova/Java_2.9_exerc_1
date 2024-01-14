package Figures.quadrilaterals; // Пакет класса Rectangle

// Класс Rectangle, наследуется от Quadrilateral
public class Rectangle extends Quadrilateral {

    // Конструктор для прямоугольника
    public Rectangle(double length, double width) {
        // Две пары равных сторон: length и width
        super(length, width, length, width);
    }

    // Реализация метода для вычисления площади
    @Override
    public double getArea() {
        // Площадь прямоугольника равна произведению его длины и ширины
        return a * b;
    }

    // Реализация метода для вычисления периметра
    @Override
    public double getPerimeter() {
        // Периметр прямоугольника равен удвоенной сумме его длины и ширины
        return 2 * (a + b);
    }
}

