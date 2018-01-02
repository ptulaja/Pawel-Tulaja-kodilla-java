package com.kodilla.good.patterns.challanges_food2Door;

public class Food2DoorRunner {
    public static void main (String[] args) throws java.lang.Exception {

        SupplierShop supplier = new HealthyShop();
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve(supplier);
        supplier.process(new OrderService().confirmOrder(orderRequest));
    }

}
