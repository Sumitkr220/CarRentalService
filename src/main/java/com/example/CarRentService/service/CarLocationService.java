package com.example.CarRentService.service;

import com.example.CarRentService.entity.CarLocation;
import com.example.CarRentService.repository.CarLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarLocationService {
    @Autowired
    private CarLocationRepository carLocationRepository;

    public CarLocation saveCarLocation(CarLocation carLocation) {
        return carLocationRepository.save(carLocation);
    }
}
