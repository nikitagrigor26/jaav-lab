package org.example;

public class Avto {
    public String brand;
    public int year;
    public double price;
    public Avto(String brand, int year,double price){
        this.brand=brand;
        this.year=year;
        this.price=price;
    }
    @Override
    public String toString(){
        return "Бренд :"+this.brand+", год:"+this.year+" , цена:"+this.price;
    }
}
