package com.pedido.sistemaPedido.repository;

import com.pedido.sistemaPedido.model.Order;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepository extends ReactiveMongoRepository<Order, String> {
}
