package org.coffeeshop.coffeeshopproject.entities;

import jakarta.persistence.*;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "suppliers")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String Company;

    private String phone;

    private String email;

    private String address;

    @OneToMany(
            mappedBy = "supplier",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<InventoryItem> inventoryItems;

}
