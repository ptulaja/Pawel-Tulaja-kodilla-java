package com.kodilla.good.patterns.challenges.OrderServiceAllegro.AllClass;

import com.kodilla.good.patterns.challenges.OrderServiceAllegro.AllInterface.OrderService;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {

    public boolean order(User user, LocalDateTime from, Order order) {
        return true;
    }
}
