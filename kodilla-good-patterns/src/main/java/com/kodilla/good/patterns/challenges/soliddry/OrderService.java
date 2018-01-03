package com.kodilla.good.patterns.challenges.soliddry;

import java.time.LocalDateTime;

public interface OrderService {
    boolean order(User user, LocalDateTime from, Order order);
}
