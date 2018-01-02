package com.kodilla.good.patterns.challenges_9_2;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getFrom(), orderRequest.getOrder());

        if (isOrdered) {
            informationService.inform(orderRequest.getUser(), orderRequest.getOrder());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getFrom());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
