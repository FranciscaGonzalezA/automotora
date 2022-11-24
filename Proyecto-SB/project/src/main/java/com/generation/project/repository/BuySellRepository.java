package com.generation.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.generation.project.model.BuySell;

public interface BuySellRepository extends JpaRepository<BuySell, Integer> {
    
    @Query(value = "SELECT * FROM buy_sell WHERE amount <= ?1", nativeQuery = true)
    List<BuySell> findLowerAmount (int amount);

    @Query(value = "SELECT * FROM buy_sell WHERE amount >= ?1", nativeQuery = true)
    List<BuySell> findUpperAmount (int amount);
}
