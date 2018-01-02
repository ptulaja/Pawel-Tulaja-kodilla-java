package com.kodilla.good.patterns.challanges_food2Door;

public class OrderService {

    public OrderDTO confirmOrder(OrderRequest order) {
        System.out.println("Nowe zamowienie ze sklepu: " + order.getSupplierName() + "\nLista produktow: " + order.getProduct());
        return new OrderDTO(order, true);
    }
}
