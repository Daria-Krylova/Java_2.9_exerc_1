package Figures.quadrilaterals; // Пакет для класса Quadrilateral

import Figures.Figure; // Импорт абстрактного класса Figure

// Класс Quadrilateral, наследующийся от Figure
public abstract class Quadrilateral extends Figure {
    protected double a; // Длина стороны a
    protected double b; // Длина стороны b
    protected double c; // Длина стороны c
    protected double d; // Длина стороны d

    // Конструктор с параметрами для четырёхугольника
    public Quadrilateral(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    // Абстрактные методы getArea и getPerimeter
    @Override
    public abstract double getArea();

    @Override
    public abstract double getPerimeter(); // Метод для вычисления периметра может быть реализован здесь, если есть общая формула
}
