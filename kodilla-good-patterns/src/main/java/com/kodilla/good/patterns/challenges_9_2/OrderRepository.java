package com.kodilla.good.patterns.challenges_9_2;

import java.time.LocalDateTime;

public interface OrderRepository {
    void createOrder(User user, LocalDateTime from);
}
