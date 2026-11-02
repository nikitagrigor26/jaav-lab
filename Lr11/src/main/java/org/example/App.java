package org.example;


public class App {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0]= new Dog("Шарик",12,150);
        animals[1]=new Dog("Бобик",10,100);
        animals[2]=new Fish("Немо",8,20);
        animals[3]=new Fish("Дори",7,25);
        for(Animal an : animals){
            an.makeSound();
            an.move();
            System.out.println("----------");
        }
        Animal a = new Animal("Жук",12,12);
        a.makeSound(15);
        a.makeSound("грустно");
    }
}
