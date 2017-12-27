package com.kodilla.good.patterns.challenges.OrderService;

import java.time.LocalDateTime;

public interface OrderService {
    boolean order(User user, LocalDateTime from);
}
