package org.coffeeshop.coffeeshopproject.entities;

import jakarta.persistence.*;
import lombok.*;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String phone;

    private String address;

    @Column( name = "loyalty_point")
    private String loyaltyPoint;

    @Column( name = "total_spend" )
    private BigDecimal totalSpend;

    @Column( name = "created_at" )
    private LocalDateTime createdAt;

    @OneToMany(
            mappedBy = "customer",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Order> orders;

    @OneToMany(
            mappedBy = "customer",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<LoyaltyTransaction> loyaltyTransactions;
}
