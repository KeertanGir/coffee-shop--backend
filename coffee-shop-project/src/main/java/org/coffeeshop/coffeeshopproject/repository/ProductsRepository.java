package org.coffeeshop.coffeeshopproject.repository;

import org.coffeeshop.coffeeshopproject.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Long> {
}
