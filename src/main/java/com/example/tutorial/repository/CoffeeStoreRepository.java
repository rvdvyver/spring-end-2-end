package com.example.tutorial.repository;

import com.example.tutorial.model.CoffeeStore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeStoreRepository extends JpaRepository<CoffeeStore, Long> {
}
