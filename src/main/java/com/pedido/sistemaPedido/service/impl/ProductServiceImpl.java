package com.pedido.sistemaPedido.service.impl;

import com.pedido.sistemaPedido.model.Product;
import com.pedido.sistemaPedido.repository.IProductRepository;
import com.pedido.sistemaPedido.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductRepository productRepository;

    @Override
    public Flux<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Mono<Product> findById(String id) {
        return productRepository.findById(id);
    }

    @Override
    public Mono<Product> save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Mono<Product> update(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return productRepository.deleteById(id);
    }
}
