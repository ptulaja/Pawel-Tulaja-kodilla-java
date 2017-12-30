package com.kodilla.good.patterns.challenges.OrderServiceAllegro.AllClass;

public class Order {

    private Products products;
    private double quantity;
    private double orderTotalPrice;

    public Order(Products products, double quantity) {
        this.products = products;
        this.quantity = quantity;
    }

    public Products getProducts() {
        return products;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getOrderTotalPrice() {
        return products.getPriceOfProduct() * quantity;
    }
}
