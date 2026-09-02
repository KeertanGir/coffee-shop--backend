package org.coffeeshop.coffeeshopproject.entities;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "inventory_item")
public class InventoryItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer quantity;

    private Integer unit;

    @Column( name = "minimum_stock" )
    private Integer minimumStock;

    @Column( name = "cost_per_unit" , nullable = false)
    private BigDecimal costPerUnit;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supplier_id" , nullable = false)
    private Supplier supplier;


    @OneToMany(
            mappedBy = "inventoryItems",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Recipe> recipes;

    @OneToMany(
            mappedBy = "inventoryItem",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<StockTransaction> stockTransactions;
}
