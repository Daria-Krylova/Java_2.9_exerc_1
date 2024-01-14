package Figures.triangles;

import Figures.Figure;

// Абстрактный класс Triangle, наследуется от Figure
public abstract class Triangle extends Figure {
    protected double a; // Длина стороны a
    protected double b; // Длина стороны b
    protected double c; // Длина стороны c

    // Конструктор с параметрами для треугольника
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Переопределение метода для вычисления периметра
    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    // Абстрактный метод для вычисления площади
    @Override
    public abstract double getArea();
}
