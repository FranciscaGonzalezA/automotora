package com.generation.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.generation.project.model.Car;
import com.generation.project.service.CarService;

@CrossOrigin("*")
@RestController
public class CarController {
    private CarService carService;

    public CarController (@Autowired CarService carService) {
        this.carService = carService;
    }

    @PostMapping("/car/save")
    public void guardarAuto (@RequestBody Car car) {
        carService.saveCar(car);
    }

    @PutMapping("/car/update")
    public void actualizarAuto (@RequestBody Car car) {
        carService.updateCar(car);
    }

    @GetMapping("/car/findAll")
    public List<Car> todosLosAutos () {
        return carService.findAll();
    }

    @GetMapping("/car/buscarMarca/{marca}")
    public List<Car> buscarMarca (@PathVariable String marca) {
        return carService.findByBrand(marca);
    }

    @GetMapping("/car/buscarColor")
    public List<Car> buscarColor (@RequestBody String color) {
        return carService.findByBrand(color);
    }

    @GetMapping("/car/buscarColorMarca")
    public List<Car> buscarColorMarca (@RequestBody String color, String marca) {
        return carService.findByColorBrand(color, marca);
    }

    @DeleteMapping("/car/eliminarAuto/{id}")
    public void eliminarAuto (@PathVariable Integer id) {
        carService.deleteCar(id);
    }
}
