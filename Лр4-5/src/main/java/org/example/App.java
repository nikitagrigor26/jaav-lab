package org.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(3, 4);
        System.out.println("Дробь 1: " + fraction1 + " = " + fraction1.toDecimal());
        System.out.println("Дробь 2: " + fraction2 + " = " + fraction2.toDecimal());
        System.out.println("Задание 2");
        Avto[] avtomob = new Avto[]{
                new Avto("Audi",2020,50000),
                new Avto("BMW",1999,10000),
                new Avto("Cherry",2000,5000),
                new Avto("Mercedez-benz",2015,25000),
                new Avto ("Gelly",2020,15000)};
        for (Avto value : avtomob) {
            System.out.println(value);
        }
        Avto mostExpensive = avtomob[0];
        Avto oldest = avtomob[0];
        for (Avto avto : avtomob) {
            if (avto.price > mostExpensive.price) {
                mostExpensive = avto;
            }
            if (avto.year < oldest.year) {
                oldest = avto;
            }
        }
        System.out.println("Самый дорогой авто: " + mostExpensive);
        System.out.println("Самый старый авто: " + oldest);
        System.out.println("Задание 3");
        User[] users = new User[]{
                new User("Никита",Role.ADMIN),
                new User("Илья",Role.USER),
                new User("Эрнест",Role.ADMIN)
        };
        System.out.println("Вывод только администраторов");
        for (User user : users){
            if(user.role == Role.ADMIN){
                System.out.println(user);
            }
        }

    }
}
