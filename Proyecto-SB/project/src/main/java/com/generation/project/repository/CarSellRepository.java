package com.generation.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.generation.project.model.CarSell;

public interface CarSellRepository extends JpaRepository<CarSell, Integer> {
    
    @Query(value = "SELECT * FROM car_sell WHERE cuantity = ?1", nativeQuery = true)
    List<CarSell> findAllCuantity (int cuantity);

    @Query(value = "SELECT * FROM car c, car_sell cs WHERE c.id = cs.car and amount > 0", nativeQuery = true)
    List<CarSell> buscarAutosEnStock ();
}
