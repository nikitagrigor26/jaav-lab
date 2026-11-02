package org.example;

public class Triangle extends Shape{
    private double base;
    private double height;
    public Triangle(double base, double height) {
        super("Треугольник", 0.5 * base * height);
        this.base = base;
        this.height = height;
    }
    public String toString() {
        return super.toString() + " base=" + base + ", height=" + height + " ";
    }
}
