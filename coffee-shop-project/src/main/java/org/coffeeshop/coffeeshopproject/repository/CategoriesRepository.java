package org.coffeeshop.coffeeshopproject.repository;

import org.coffeeshop.coffeeshopproject.entities.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<Categories, Long> {
}
