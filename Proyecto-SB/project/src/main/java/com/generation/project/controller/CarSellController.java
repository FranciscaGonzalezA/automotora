package com.generation.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.generation.project.model.CarSell;
import com.generation.project.service.CarSellService;

@CrossOrigin("*")
@RestController
public class CarSellController {
    private CarSellService carSellService;

    public CarSellController (@Autowired CarSellService carSellService) {
        this.carSellService = carSellService;
    }

    @PostMapping("/carsell/save")
    public void guardarAutoCompra (@RequestBody CarSell carSell) {
        carSellService.saveCarSell(carSell);
    }

    @PutMapping("/carsell/update")
    public void actualizarAuto (@RequestBody CarSell carSell) {
        carSellService.updateCarSell(carSell);
    }

    @GetMapping("/carsell/findAll")
    public List<CarSell> todosLosAutosComprados () {
        return carSellService.findAllCarSell();
    }

    @GetMapping("/carsell/buscarCantidad/{cantidad}")
    public List<CarSell> buscarPorCantidad (@PathVariable int cantidad) {
        return carSellService.findByCuantity(cantidad);
    }

    @GetMapping("/carsell/buscarEnStock")
    public List<CarSell> buscarEnStock () {
        return carSellService.findStock();
    }

    @DeleteMapping("/carsell/eliminarAutoCompra/{id}")
    public void eliminarAutoCompra(@PathVariable Integer id) {
        carSellService.deleteCarSell(id);
    }
}
