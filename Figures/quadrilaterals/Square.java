package Figures.quadrilaterals; // Пакет для класса Square

// Класс Square, наследуется от Quadrilateral
public class Square extends Quadrilateral {

    // Конструктор для квадрата
    public Square(double side) {
        // Все стороны квадрата равны
        super(side, side, side, side);
    }

    // Реализация метода для вычисления площади
    @Override
    public double getArea() {
        // Площадь квадрата равна квадрату его стороны
        return a * a;
    }

    // Реализация метода для вычисления периметра
    @Override
    public double getPerimeter() {
        // Периметр квадрата равен четырехкратной длине одной из его сторон
        return 4 * a;
    }
}
