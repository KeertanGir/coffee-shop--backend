package org.coffeeshop.coffeeshopproject.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.security.PrivateKey;

@Entity
@Table(name = "order_item_addons")
public class OrderItemAddon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal price;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn(name = "order_item_id" , nullable = false)
    private OrderItem orderItem;

    @ManyToOne( fetch = FetchType.LAZY)
    @JoinColumn(name = "addon_id", nullable = false )
    private Addon addon;

}
