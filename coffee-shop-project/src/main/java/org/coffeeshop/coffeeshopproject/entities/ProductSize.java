package org.coffeeshop.coffeeshopproject.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Table(name = "product_sizes")
@Entity
public class ProductSize {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private BigDecimal price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productId", nullable = false)
    private Product product;

    @OneToMany(
            mappedBy = "size",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<OrderItem> items;

}
