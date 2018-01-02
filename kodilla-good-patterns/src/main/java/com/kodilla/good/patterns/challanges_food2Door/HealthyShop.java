package com.kodilla.good.patterns.challanges_food2Door;

public class HealthyShop implements SupplierShop {

    private final String NAME = "Healthy Shop";

    public void process(OrderDTO orderDTO) {
        if(orderDTO.getOrderConfirmation()) {
            System.out.println("\nZamowienie zatwierdzono - czeka na realizacje.");
        }
    }

    public String getName() {
        return NAME;
    }
}
