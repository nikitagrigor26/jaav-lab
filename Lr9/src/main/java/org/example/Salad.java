package org.example;

public class Salad extends Food {
    String dressing;
    public String getDressing(){
        return dressing;
    }
    public void setDressing(String value){
        if(value==""){
            System.out.println("Ошибка заправка не может быть пустым");
            return;
        }
        dressing=value;
    }
    public Salad(String dressing,String name,int calories,double price){
        super(name,calories,price);
        setDressing(dressing);
    }
    @Override
    public void cook(){
        System.out.println("нарезается и смешивается");
    }
    @Override
    public void getExpirationDays(){
        System.out.println("Срок годности 1 день");
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Заправка:"+getDressing());
    }
}
