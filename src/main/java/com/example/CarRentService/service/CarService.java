package com.example.CarRentService.service;

import com.example.CarRentService.entity.Car;
import com.example.CarRentService.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;
    @Autowired
    private CarLocationService carLocationService;

    public List<Car> findAvailableCarsByLocation(String location) {
        return carRepository.findByLocationCity(location);
    }

    public Car registerCar(Car car) {
        car.setLocation(carLocationService.saveCarLocation(car.getLocation()));
        return carRepository.save(car);
    }
}
