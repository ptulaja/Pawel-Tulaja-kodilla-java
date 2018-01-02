package com.kodilla.good.patterns.challenges_9_2;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Pablo_ski", "Pawel", "Tulaja", "Warszawa");
        LocalDateTime orderFrom = LocalDateTime.of(2017, 12, 27, 12, 00);
        Products products = new  Products("Water",12.99);
        Order order = new Order(products, 4);

        return new OrderRequest(user, orderFrom, products, order);
    }
}
