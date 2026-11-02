package org.example;

public class Circle extends Shape {
    double radius;
    public double getRadius(){
        return radius;
    }
    public void setRadius(double value){
        if(value<=0){
            System.out.println("радиус не может быть отрицательным");
            return;
        }
        radius=value;
    }
    public Circle(double radius){
        super("Круг",Math.PI * radius * radius);
        setRadius(radius);
    }
    @Override
    public String toString() {
        return super.toString() + " radius=" + radius + " ";
    }
}
