package com.miu.teo.book.cloudnativespring.orderservice.order.web;

import com.miu.teo.book.cloudnativespring.orderservice.order.domain.Order;
import com.miu.teo.book.cloudnativespring.orderservice.order.domain.OrderService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("orders")
public class OrderController {
    private final OrderService orderService;
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public Flux<Order> getOrders() {
        return orderService.getAllOrders();
    }

    @PostMapping
    public Mono<Order> submitOrder(@RequestBody @Valid OrderRequest order) {
        return orderService.submitOrder(order.isbn(), order.quantity());
    }
}
