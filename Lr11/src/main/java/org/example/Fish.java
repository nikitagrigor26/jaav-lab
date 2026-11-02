package org.example;

public class Fish extends Animal{
    public Fish(String name,int age,double weight){
        super(name,age,weight);
    }
    @Override
    public void move(){
        System.out.println("Плавает");
    }
    @Override
    public void makeSound(){
        System.out.println("рыбы не говорят...");
    }
}
