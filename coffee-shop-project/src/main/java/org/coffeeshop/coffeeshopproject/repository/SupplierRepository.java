package org.coffeeshop.coffeeshopproject.repository;

import org.coffeeshop.coffeeshopproject.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
