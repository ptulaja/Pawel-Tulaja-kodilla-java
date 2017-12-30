package com.kodilla.good.patterns.challenges.OrderServiceAllegro;

import com.kodilla.good.patterns.challenges.OrderServiceAllegro.AllClass.*;

public class OrderServicesAllegroRunner {
    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new ProductOrderService(), new ProductOrderRepository());
        orderProcessor.process(orderRequest);
    }
}
