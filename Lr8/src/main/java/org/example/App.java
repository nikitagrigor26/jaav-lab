package org.example;


public class App {
    public static void main(String[] args) {
        Product[] cart = new Product[5];
        cart[0] = new Electronics("Смартфон", 2500, 0.2, 24);
        cart[1] = new Electronics("Ноутбук", 4500, 1.8, 12);
        cart[2] = new Electronics("Чайник", 150, 0.9, 6);
        cart[3] = new Food("Молоко", 3.5, 1.0, 5);
        cart[4] = new Food("Йогурт", 2.1, 0.4, 0);
        System.out.println("Все товары и скидки");
        System.out.println();
        for (int i = 0; i < cart.length; i++) {
            System.out.println(cart[i]);
            System.out.println("Скижка: " + cart[i].getDiscount());
            System.out.println();
        }
        System.out.println("Демонстрация методов");
        for (int i = 0; i < cart.length; i++) {
            cart[i].checkSpecialFeatures();
        }
    }
}
