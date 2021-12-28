package com.pedido.sistemaPedido.service;

import com.pedido.sistemaPedido.model.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IProductService {
    public Flux<Product> findAll();
    public Mono<Product> findById(String id);
    public Mono<Product> save(Product product);
    public Mono<Product> update(Product product);
    public Mono<Void> deleteById(String id);
}
