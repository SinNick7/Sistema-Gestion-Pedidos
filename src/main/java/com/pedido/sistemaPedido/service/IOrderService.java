package com.pedido.sistemaPedido.service;

import com.pedido.sistemaPedido.model.Order;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IOrderService {
    public Flux<Order> findAll();
    public Mono<Order> findById(String id);
    public Mono<Order> save(Order order);
    public Mono<Order> update(Order order);
    public Mono<Void> deleteById(String id);
}
