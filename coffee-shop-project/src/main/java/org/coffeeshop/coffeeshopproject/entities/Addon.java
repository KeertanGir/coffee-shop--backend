package org.coffeeshop.coffeeshopproject.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "addons")
public class Addon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private BigDecimal price;

    private Boolean available;

    @OneToMany(
            mappedBy = "addon",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<OrderItemAddon> itemAddons;

}
