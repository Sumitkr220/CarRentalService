package com.example.CarRentService.repository;

import com.example.CarRentService.entity.Car;
import com.example.CarRentService.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
}
