package org.coffeeshop.coffeeshopproject.entities;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "inventory_item")
public class InventoryItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer quantity;

    private Integer unit;

    private Integer minimumStock;

    private BigDecimal costPerUnit;

    private Long supplierId;
}
