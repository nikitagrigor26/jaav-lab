package org.example;

public class App {
    public static void main(String[] args) {
        Food[] menu = new Food[5];
        menu[0] = new Pizza("Сыр", "Пицца 4-сыра", 500, 2500.00);
        menu[1] = new Pizza("Кетчуп, ветчина, сыр", "Пицца ветчина с сыром", 750, 3000.00);
        menu[2] = new Pizza("пеперони, сыр, кетчуп", "Пицца пеперони", 600, 2750.00);
        menu[3] = new Salad("Масло", "Салат свежий", 250, 500.00);
        menu[4] = new Salad("Майонез", "Салат оливье", 250, 450.00);
        for (Food item : menu) {
            item.displayInfo();
            item.cook();
            item.getExpirationDays();
            System.out.println("-----------------");
        }
    }
}
