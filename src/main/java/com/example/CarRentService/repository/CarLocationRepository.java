package com.example.CarRentService.repository;

import com.example.CarRentService.entity.Car;
import com.example.CarRentService.entity.CarLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarLocationRepository extends JpaRepository<CarLocation, Long> {
}
