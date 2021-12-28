package com.pedido.sistemaPedido.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "product")
public class Product {
    @Id
    private String id;
    private String categoria;
    private double precioUnitario;
    private boolean activo;
}
