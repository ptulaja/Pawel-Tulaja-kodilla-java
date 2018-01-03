package com.kodilla.good.patterns.challenges.soliddry;

import java.time.LocalDateTime;

public interface OrderRepository {
    void createOrder(User user, LocalDateTime from);
}
