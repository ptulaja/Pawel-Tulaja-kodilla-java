package com.kodilla.good.patterns.challenges.food2Door;

public class OrderRequestRetriever {

    public OrderRequest retrieve(SupplierShop supplier) {
        Product product = new Product("Jogurt naturalny 50 ml", 2);

        return new OrderRequest(supplier.getName(), product);
    }
}
