package org.example;

public class Rectangle extends  Shape{
    double width,height;
    public double getWidth() {
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double value){
        if(value<0){
            System.out.println("Размер не может быть отрицательным");
            return;
        }
        width=value;
    }
    public void setHeight(double value){
        if(value<0){
            System.out.println("Размер не может быть отрицательным");
            return;
        }
        height=value;
    }
    public Rectangle(double wiidth,double height){
        super("Прямоугольник",wiidth * height);
        setHeight(height);
        setWidth(wiidth);
    }
    @Override
    public String toString() {
        return super.toString() + " width=" + width + ", height=" + height + " ";
    }

}
