package com.pedido.sistemaPedido.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "order")
public class Order {

    @Id
    private String id;
    private String estado;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime fecha;
    private String cliente;
    private Integer cantidadImpuesto;
    private double totalImpuesto;
    private Integer cantidadTotal;
    private List<Product> listaArticulo;

}
