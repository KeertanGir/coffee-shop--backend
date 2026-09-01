package org.coffeeshop.coffeeshopproject.entities;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "order_item")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "size_id")
    private ProductSize size;

    @OneToMany(
            mappedBy = "orderItem",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<OrderItemAddon> itemAddons;
}
