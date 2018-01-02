package com.kodilla.good.patterns.challanges_food2Door;

public class GlutenFreeShop implements SupplierShop {

    private final static String NAME = "Gluten Free Shop";

    public void process(OrderDTO orderDTO) {
        if(orderDTO.getOrderConfirmation()) {
            System.out.println("\nZamowienie zatwierdzono - czeka na realizacje.");
        }
    }

    public String getName() {
        return NAME;
    }
}
