package com.soham.food_delivery.repository;

import com.soham.food_delivery.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser, Long> {
    public AppUser findByEmail(String username);
}
