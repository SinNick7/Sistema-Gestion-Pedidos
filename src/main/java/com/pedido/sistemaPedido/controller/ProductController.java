package com.pedido.sistemaPedido.controller;

import com.pedido.sistemaPedido.model.Order;
import com.pedido.sistemaPedido.model.Product;
import com.pedido.sistemaPedido.service.impl.ProductServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @GetMapping("/list")
    public Flux<Product> listProduct() {
        log.info("Get list of products");
        return productService.findAll();
    }

    @PostMapping("/add")
    public void createProduct(@RequestBody Product product) {
        log.info("Create product");
        productService.save(product).subscribe();
    }

    @PutMapping("/update")
    public Mono<Product> updateProduct(@RequestBody Product product) {
        log.info("Update product");
        return productService.update(product);
    }

    @DeleteMapping("/delete/{id}")
    public Mono<Void> deleteProduct(@PathVariable("id") String id) {
        log.info("Delete a specific product");
        return productService.deleteById(id);
    }

}
