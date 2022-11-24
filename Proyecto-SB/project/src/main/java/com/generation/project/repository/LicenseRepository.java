package com.generation.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.generation.project.model.License;

public interface LicenseRepository extends JpaRepository<License, Integer> {
    
    @Query(value = "SELECT * FROM license WHERE driver_class = ?1", nativeQuery = true)
    List<License> findAllLicenciaClase (String driverClass);

    @Query(value = "SELECT * FROM license WHERE status = ?1", nativeQuery = true)
    List<License> findAllLicenciaEstado (String status);

    @Query(value = "SELECT * FROM license WHERE status = ?1 AND driver_class =?2", nativeQuery = true)
    List<License> findAllLicenciaEstadoClase (String status, String driverClass);
}