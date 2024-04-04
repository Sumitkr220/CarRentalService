package com.example.CarRentService.controller;

import com.example.CarRentService.entity.Car;
import com.example.CarRentService.entity.User;
import com.example.CarRentService.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping("/cars/search")
    public List<Car> searchCar(@RequestParam("location") String location) {
        return carService.findAvailableCarsByLocation(location);
    }
    @PostMapping("/register/car")
    public Car registerUser(@RequestBody Car car) {
        return carService.registerCar(car);
    }
}
