package com.kodilla.good.patterns.challenges.OrderServiceAllegro.AllClass;

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
