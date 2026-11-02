package org.example;

public class Pizza extends Food {
    String tooping;
    public String getTooping() {
        return tooping;
    }
    public void setTooping(String value){
        if(value==""){
            System.out.println("Ошибка начинка не может быть пустым");
            return;
        }
        tooping=value;
    }
    public Pizza(String tooping1,String name,int calories,double price){
        super(name,calories,price);
        this.tooping=tooping1;
    }
    @Override
    public void cook(){
        System.out.println("Пицца готовится 20 минут");
    }

    @Override
    public void getExpirationDays(){
        System.out.println("Срок годности 3 дня");
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Начинка:"+getTooping());
    }
}
