package org.example;

public class Building {
    protected String address;
    protected int kol;
    public int getKol(){
        return kol;
    }
    public void setKol(int value){
        kol=value;
    }








































    public String getAddress(){
        return address;
    }
    protected int floors;
    public int getFloors(){
        return floors;
    }
    protected double totalArea;
    public double getTotalArea(){
        return totalArea;
    }
    public Building(String addres,int floor,double totalAr){
        address=addres;
        floors=floor;
        totalArea=totalAr;
    }
    public Building(String addres,int floor,double totalAr,int koll){
        this(addres, floor, totalAr);
        setKol(koll);
    }
    public double averageAreaPerFloor() {
        if (floors <= 0) {
            return 0;
        }
        return totalArea / floors;
    }

    @Override
    public String toString(){
        return "Адрес: "+getAddress() +" Этаж: "+ getFloors() + "Площадь:"+ getTotalArea();
    }

}
