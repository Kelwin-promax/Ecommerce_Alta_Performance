package com.ecommerce.highperf.domain.model;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.io.Serializable;

@Entity
@Table(name = "products")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer stock;
}
