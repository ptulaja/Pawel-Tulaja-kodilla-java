package com.kodilla.good.patterns.challenges.food2Door;

public class ExtraFoodShop implements SupplierShop {

    private final static String NAME = "Extra Food Shop";

    public void process(OrderDTO orderDTO) {
        if(orderDTO.getOrderConfirmation()) {
            System.out.println("\nZamowienie zatwierdzono - czeka na realizacje.");
        }
    }

    public String getName() {
        return NAME;
    }
}
