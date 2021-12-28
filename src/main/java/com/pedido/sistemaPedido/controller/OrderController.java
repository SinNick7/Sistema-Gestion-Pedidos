package com.pedido.sistemaPedido.controller;

import com.pedido.sistemaPedido.model.Order;
import com.pedido.sistemaPedido.service.impl.OrderServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderServiceImpl orderService;

    @GetMapping("/list")
    public Flux<Order> listOrder() {
        log.info("Get list of orders");
        return orderService.findAll();
    }

    @PostMapping("/add")
    public void createOrder(@RequestBody Order order) {
        log.info("Create order");
        orderService.save(order).subscribe();
    }

    @PutMapping("/update")
    public Mono<Order> updateOrder(@RequestBody Order order) {
        log.info("Update order");
        return orderService.update(order);
    }

    @DeleteMapping("/delete/{id}")
    public Mono<Void> deleteOrder(@PathVariable("id") String id) {
        log.info("Delete a specific order");
        return orderService.deleteById(id);
    }

}
