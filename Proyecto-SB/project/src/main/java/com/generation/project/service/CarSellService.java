package com.generation.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.generation.project.model.CarSell;
import com.generation.project.repository.CarSellRepository;

@Service
@Transactional
public class CarSellService {

    private CarSellRepository carSellRepository;

    public CarSellService (CarSellRepository carSellRepository) {
        this.carSellRepository = carSellRepository;
    }
    
    public void saveCarSell (CarSell carSell) {
        carSellRepository.save(carSell);
    }

    public void updateCarSell (CarSell carSell) {
        carSellRepository.save(carSell);
    }

    public List<CarSell> findAllCarSell () {
        return carSellRepository.findAll();
    }

    public List<CarSell> findByCuantity (int cantidad) {
        return carSellRepository.findAllCuantity(cantidad);
    }

    public List<CarSell> findStock () {
        return carSellRepository.buscarAutosEnStock();
    }

    public void deleteCarSell (Integer id) {
        carSellRepository.deleteById(id);
    }
}
