package com.miu.teo.book.cloudnativespring.orderservice.order.web;

import com.miu.teo.book.cloudnativespring.orderservice.order.domain.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.reactive.server.WebTestClient;

@WebFluxTest(OrderController.class)
public class OrderControllerWebFluxTests {
    @Autowired
    private WebTestClient webClient;

    @MockitoBean
    private OrderService orderService;

}
