package com.example.CarRentService.repository;

import com.example.CarRentService.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByLocationCity(String city);
}
