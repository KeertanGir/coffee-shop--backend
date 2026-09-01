package org.coffeeshop.coffeeshopproject.entities;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "categories")
public class Category {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String imageUrl;
    private Boolean active;

    @OneToMany(mappedBy = "category"
    , cascade = CascadeType.ALL
    , orphanRemoval = true
    )
    private List<Product> productsList;


}
