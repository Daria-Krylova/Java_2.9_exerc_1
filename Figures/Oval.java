package Figures;

public class Oval extends Figure {
    private double semiMajorAxis; // Большая полуось овала
    private double semiMinorAxis; // Малая полуось овала

    // Конструктор для овала
    public Oval(double semiMajorAxis, double semiMinorAxis) {
        this.semiMajorAxis = semiMajorAxis;
        this.semiMinorAxis = semiMinorAxis;
    }

    // Реализация метода для вычисления площади овала (эллипса)
    @Override
    public double getArea() {
        // Площадь овала: π * a * b, где a - большая полуось, b - малая полуось
        return Math.PI * semiMajorAxis * semiMinorAxis;
    }

    // Определение периметра овала (приближенное значение)
    @Override
    public double getPerimeter() {
        // Для овала точное вычисление периметра сложно, поэтому вернем приближенное значение
        // Можно использовать формулу Рамануджана: π * (3 * (a + b) - sqrt((3a + b) * (a + 3b)))
        return Math.PI * (3 * (semiMajorAxis + semiMinorAxis) - Math.sqrt((3 * semiMajorAxis + semiMinorAxis) * (semiMajorAxis + 3 * semiMinorAxis)));
    }
}
