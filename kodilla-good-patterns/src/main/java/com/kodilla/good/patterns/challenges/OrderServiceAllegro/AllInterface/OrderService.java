package com.kodilla.good.patterns.challenges.OrderServiceAllegro.AllInterface;

import com.kodilla.good.patterns.challenges.OrderServiceAllegro.AllClass.Order;
import com.kodilla.good.patterns.challenges.OrderServiceAllegro.AllClass.User;

import java.time.LocalDateTime;

public interface OrderService {
    boolean order(User user, LocalDateTime from, Order order);
}
