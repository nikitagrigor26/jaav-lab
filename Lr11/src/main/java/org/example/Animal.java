package org.example;

public class Animal {
    String name;
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
    int age;
    public int getAge(){
        return age;
    }
    public void setAge(int value){
        if(value<0){
            System.out.println("Возраст не может быть отрицательным");
            return;
        }
        age=value;
    }
    double weight;
    public double getWeight() {
        return weight;
    }
    public void setWeight(double value) {
        if(value<0){
            System.out.println("Ошибка рост не может быть отрицательным");
            return;
        }
        weight = value;
    }
    public Animal(String name,int age,double weight){
        setName(name);
        setAge(age);
        setWeight(weight);
    }
    public void makeSound(){
        System.out.println("издает звук");
    }
    public void makeSound(int volume){
        System.out.println("Издает звук громкостью " + volume);
    }
    public void makeSound(String mood){
        System.out.println("Издает "+mood+" звук");
    }
    public void move(){
        System.out.println("Животное двигается");
    }


}
