package org.example;

public class Product {
    private String name;
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    private double price;
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    private double weight;
    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    public Product(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
    public String getDiscount() {
        return "Скидки нет";
    }
    public void checkSpecialFeatures() {}
    @Override
    public String toString() {
        return "Товар: " + name + ", Цена: " + price + " руб., Вес: " + weight + " кг.";
    }
}
