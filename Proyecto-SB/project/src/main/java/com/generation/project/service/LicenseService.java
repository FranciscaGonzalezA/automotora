package com.generation.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.generation.project.model.License;
import com.generation.project.repository.LicenseRepository;

@Service
@Transactional
public class LicenseService {

    private LicenseRepository licenseRepository;

    public LicenseService (LicenseRepository licenseRepository) {
        this.licenseRepository = licenseRepository;
    }
    
    public void saveLicense (License license) {
        licenseRepository.save(license);
    }

    public void updateLicense (License license) {
        licenseRepository.save(license);
    }

    public List<License> findAllLicense () {
        return licenseRepository.findAll();
    }

    public List<License> findByClass (String clase) {
        return licenseRepository.findAllLicenciaClase(clase);
    }

    public List<License> findByStatus (String estado) {
        return licenseRepository.findAllLicenciaEstado(estado);
    }

    public List<License> findByStatusClass (String estado, String clase) {
        return licenseRepository.findAllLicenciaEstadoClase(estado, clase);
    }

    public void deleteLicense (Integer id) {
        licenseRepository.deleteById(id);
    }
}