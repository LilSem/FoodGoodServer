package com.foodgood.server.repository;

import com.foodgood.server.entity.userRestaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRestaurantRepository extends JpaRepository<userRestaurant, Long> {
}
