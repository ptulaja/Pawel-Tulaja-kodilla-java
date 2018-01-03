package com.kodilla.good.patterns.challenges.soliddry;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {

    public boolean order(User user, LocalDateTime from, Order order) {
        return true;
    }
}
