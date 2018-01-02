package com.kodilla.good.patterns.challenges_9_2;

public class Products {

    private String nameOfProduct;
    private double priceOfProduct;

    public Products(String nameOfProduct, double priceOfProduct) {
        this.nameOfProduct = nameOfProduct;
        this.priceOfProduct = priceOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public double getPriceOfProduct() {
        return priceOfProduct;
    }
}
