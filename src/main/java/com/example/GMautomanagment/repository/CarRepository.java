package com.example.GMautomanagment.repository;

import com.example.GMautomanagment.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
