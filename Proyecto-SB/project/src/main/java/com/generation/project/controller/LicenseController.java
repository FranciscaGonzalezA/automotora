package com.generation.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generation.project.model.License;
import com.generation.project.service.LicenseService;

@CrossOrigin("*")
@RestController
public class LicenseController {
    private LicenseService licenseService;

    public LicenseController (@Autowired LicenseService licenseService) {
        this.licenseService = licenseService;
    }

    @PostMapping("/license/save")
    public void guardarLicencia (@RequestBody License license) {
        licenseService.saveLicense(license);
    }

    @PutMapping("/license/update")
    public void actualizarLicencia (@RequestBody License license) {
        licenseService.updateLicense(license);
    }

    @GetMapping("/license/findAll")
    public List<License> todasLasLicencias () {
        return licenseService.findAllLicense();
    }

    @GetMapping("/license/buscarLicenciaClase/{clase}")
    public List<License> buscarLicenciaClase (@PathVariable String clase) {
        return licenseService.findByClass(clase);
    }

    @GetMapping("/license/buscarLicenciaEstado")
    public List<License> buscarLicenciaEstado (@RequestBody String estado) {
        return licenseService.findByStatus(estado);
    }

    @GetMapping("/license/buscarLicenciaEstadoClase")
    public List<License> buscarLicenciaEstadoClase (@RequestBody String estado, String clase) {
        return licenseService.findByStatusClass(estado, clase);
    }

    @DeleteMapping("/license/eliminarLicencia/{id}")
    public void eliminarLicencia (@PathVariable Integer id) {
        licenseService.deleteLicense(id);
    }
}