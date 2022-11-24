package com.generation.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.generation.project.model.Car;
import com.generation.project.repository.CarRepository;

@Service
@Transactional
public class CarService {

    private CarRepository carRepository;

    public CarService (CarRepository carRepository) {
        this.carRepository = carRepository;
    }
    
    public void saveCar (Car car) {
        carRepository.save(car);
    }

    public void updateCar (Car car) {
        carRepository.save(car);
    }

    public List<Car> findAll () {
        return carRepository.findAll();
    }

    public List<Car> findByBrand (String marca) {
        return carRepository.findAllAutoMarca(marca);
    }

    public List<Car> findByColor (String color) {
        return carRepository.findAllAutoColor(color);
    }

    public List<Car> findByColorBrand (String color, String marca) {
        return carRepository.findAllAutoColorMarca(color, marca);
    }

    public void deleteCar (Integer id) {
        carRepository.deleteById(id);
    }
}
