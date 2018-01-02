package com.kodilla.good.patterns.challanges_food2Door;

public class Product {

    private String name;
    private double quantity;

    public Product(String name, double quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "\n-> " + name +
                ", " + quantity + " szt. <-";
    }
}
