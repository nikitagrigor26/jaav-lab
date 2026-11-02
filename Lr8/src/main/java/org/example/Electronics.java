package org.example;

public class Electronics extends Product {
    private int warranty;
    public int getWarranty() {
        return warranty;
    }
    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public Electronics(String name, double price, double weight, int warranty) {
        super(name, price, weight);
        this.warranty = warranty;
    }

    public void checkWarranty() {
        System.out.println("Осталось месяцев гарантии: " + warranty);
    }
    @Override
    public void checkSpecialFeatures() {
        checkWarranty();
    }
    @Override
    public String getDiscount() {
        return "Скидка 5%";
    }
    @Override
    public String toString() {
        return super.toString() + " гарантия=" + warranty + " мес";
    }
}


