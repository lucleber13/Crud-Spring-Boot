package com.cbcode.crudspring.controller;

import com.cbcode.crudspring.model.Car;
import com.cbcode.crudspring.repository.CarRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CarController {

    private final CarRepository carRepository;

    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping("/cars")
    public List<Car> getCars() {
        return carRepository.findAll();
    }

    @PostMapping("/cars")
    public Car addCar(@RequestBody Car car) {
        return carRepository.save(car);
    }
}
