package com.kodilla.good.patterns.challenges.OrderServiceAllegro.AllInterface;

import com.kodilla.good.patterns.challenges.OrderServiceAllegro.AllClass.User;

import java.time.LocalDateTime;

public interface OrderRepository {
    void createOrder(User user, LocalDateTime from);
}
