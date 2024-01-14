package Figures.quadrilaterals; // Пакет для класса Rhombus

// Класс Rhombus, наследуется от Quadrilateral
public class Rhombus extends Quadrilateral {
    private double diagonal1; // Длина первой диагонали
    private double diagonal2; // Длина второй диагонали

    // Конструктор для ромба
    public Rhombus(double side, double diagonal1, double diagonal2) {
        // Все стороны ромба равны
        super(side, side, side, side);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    // Реализация метода для вычисления площади
    @Override
    public double getArea() {
        // Площадь ромба равна половине произведения его диагоналей
        return (diagonal1 * diagonal2) / 2;
    }

    // Реализация метода для вычисления периметра
    @Override
    public double getPerimeter() {
        // Периметр ромба равен четырехкратной длине одной из его сторон
        return 4 * a;
    }
}

