package com.foodgood.server.repository;

import com.foodgood.server.entity.Courier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourierRepository extends JpaRepository<Courier, Long> {
}
