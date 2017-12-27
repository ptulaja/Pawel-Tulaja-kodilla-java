package com.kodilla.good.patterns.challenges.OrderService;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Pablo_ski", "Pawel", "Tulaja", "Warszawa");
        LocalDateTime orderFrom = LocalDateTime.of(2017, 12, 27, 12, 00);

        return new OrderRequest(user, orderFrom);
    }
}
