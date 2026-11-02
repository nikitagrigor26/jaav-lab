package org.example;

public class Food extends Product {
    private int daysLeft;
    public int getDaysLeft() {
        return daysLeft;
    }
    public void setDaysLeft(int daysLeft) {
        this.daysLeft = daysLeft;
    }
    public Food(String name, double price, double weight, int daysLeft) {
        super(name, price, weight);
        this.daysLeft = daysLeft;
    }
    public void isExpired() {
        if (daysLeft <= 0) {
            System.out.println("Срок годности истек");
        } else {
            System.out.println("Продукт свежий, годен еще " + daysLeft + " дн.");
        }
    }
    @Override
    public void checkSpecialFeatures() {
        isExpired();
    }
    @Override
    public String getDiscount() {
        return "Скидка 15%";
    }
    @Override
    public String toString() {
        return super.toString() + "годен еще:" + daysLeft + "]";
    }


}

