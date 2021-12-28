package com.pedido.sistemaPedido.service.impl;

import com.pedido.sistemaPedido.model.Order;
import com.pedido.sistemaPedido.repository.IOrderRepository;
import com.pedido.sistemaPedido.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private IOrderRepository orderRepository;

    @Override
    public Flux<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Mono<Order> findById(String id) {
        return orderRepository.findById(id);
    }

    @Override
    public Mono<Order> save(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Mono<Order> update(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return orderRepository.deleteById(id);
    }
}
