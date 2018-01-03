package com.kodilla.good.patterns.challenges.food2Door;

public class OrderRequest {

    private String supplierName;
    private Product product;

    public OrderRequest(String supplierName, Product product) {
        this.supplierName = supplierName;
        this.product = product;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public Product getProduct() {
        return product;
    }
}
