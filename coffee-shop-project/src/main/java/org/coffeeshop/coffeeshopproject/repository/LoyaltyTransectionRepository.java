package org.coffeeshop.coffeeshopproject.repository;

import org.coffeeshop.coffeeshopproject.entities.LoyaltyTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoyaltyTransectionRepository extends JpaRepository<LoyaltyTransaction, Long> {
}
