package com.kodilla.good.patterns.challenges.OrderService;

import java.time.LocalDateTime;

public interface OrderRepository {
    void createOrder(User user, LocalDateTime from);
}
