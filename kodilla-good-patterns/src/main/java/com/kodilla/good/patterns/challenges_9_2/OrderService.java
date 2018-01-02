package com.kodilla.good.patterns.challenges_9_2;

import java.time.LocalDateTime;

public interface OrderService {
    boolean order(User user, LocalDateTime from, Order order);
}
