package org.example;

public class Dog extends Animal{
    public Dog(String name,int age,double weight){
        super(name,age,weight);
    }
    @Override
    public void move(){
        System.out.println("Собака бегает");
    }
    @Override
    public void makeSound(){
        System.out.println("Гав-гав");
    }
    public void test(){
        System.out.println("это метод тест 1");
    }
    public void test(int num){
        System.out.println("Это тест номер"+num);
    }
}
