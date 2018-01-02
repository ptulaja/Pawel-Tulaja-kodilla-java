package com.kodilla.good.patterns.challanges_food2Door;

public class OrderDTO {

    public OrderRequest order;
    public boolean orderConfirmation;

    public OrderDTO(OrderRequest order, boolean orderConfirmation) {
        this.order = order;
        this.orderConfirmation = orderConfirmation;
    }

    public OrderRequest getOrder() {
        return order;
    }

    public boolean getOrderConfirmation() {
        return orderConfirmation;
    }
}
