package org.example;

public class Fraction {
    public int numerator;
    public int denominator;
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            System.out.println("Ошибка невозможно делить на 0");
            return;
        }
        this.denominator = denominator;
    }
    public double toDecimal() {
        return (double) this.numerator / this.denominator;
    }
    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }
}

