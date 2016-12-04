package com.foodgood.server.repository;

import com.foodgood.server.entity.Kitchen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KitchenRepository extends JpaRepository<Kitchen, Long> {
}
