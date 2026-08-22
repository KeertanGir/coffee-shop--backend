package org.coffeeshop.coffeeshopproject.repository;

import org.coffeeshop.coffeeshopproject.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
