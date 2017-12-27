package com.kodilla.good.patterns.challenges.OrderService;

import java.time.LocalDateTime;

public class OrderRequest {

    public User user;
    public LocalDateTime from;

    public OrderRequest(User user, LocalDateTime from) {
        this.user = user;
        this.from = from;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getFrom() {
        return from;
    }
}
