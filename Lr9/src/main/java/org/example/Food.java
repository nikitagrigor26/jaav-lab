package org.example;

public abstract class Food {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String value){
        if(value==""){
            System.out.println("Ошибка имя не может быть пустым");
            return;
        }
        name=value;
    }

    private int calories;
    public int getCalories(){
        return calories;
    }
    public void setCalories(int value){
        if(value<0){
            System.out.println("Ошибка, каллории не могут быть меньше 0");
            return;
        }
        calories=value;
    }

    private double price;
    public double getPrice(){
        return price;
    }
    public void setPrice(double value){
        if(value<0){
            System.out.println("Калорий не может быть меньше 0");
            return;
        }
        price=value;
    }
    public Food(String name1,int calories1,double price1){
        this.name=name1;
        this.calories=calories1;
        this.price=price1;
    }
    public abstract void cook();
    public abstract void getExpirationDays();
    public void displayInfo(){
        System.out.print("Название:"+getName()+" Кол-во калорий:"+getCalories()+" Цена:"+getPrice()+" ");
    }
}
