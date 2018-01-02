package com.kodilla.good.patterns.challenges_9_2;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private LocalDateTime from;
    private Products products;
    private Order order;

    public OrderRequest(User user, LocalDateTime from, Products products, Order order) {
        this.user = user;
        this.from = from;
        this.products = products;
        this.order = order;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public Products getProducts() {
        return products;
    }

    public Order getOrder() {
        return order;
    }
}
