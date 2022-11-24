package com.generation.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.generation.project.model.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {
    
    @Query(value = "SELECT * FROM car WHERE brand = ?1", nativeQuery = true)
    List<Car> findAllAutoMarca(String brand);

    @Query(value = "SELECT * FROM car WHERE color = ?1", nativeQuery = true)
    List<Car> findAllAutoColor(String color);

    @Query(value = "SELECT * FROM car WHERE color = ?1 AND brand =?2", nativeQuery = true)
    List<Car> findAllAutoColorMarca(String color, String brand);

    @Query(value = "SELECT * FROM car c JOIN c.car_sell cs", nativeQuery = true)
    List<Car> buscarAutosVendidos();
}
