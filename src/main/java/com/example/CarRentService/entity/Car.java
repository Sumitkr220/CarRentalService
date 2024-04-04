package com.example.CarRentService.entity;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carId;
    private String model;
    private String color;
    private String carType;
    private String brand;

    @ManyToOne
    private CarLocation location;
}
