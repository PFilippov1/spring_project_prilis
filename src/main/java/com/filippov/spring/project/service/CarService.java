package com.filippov.spring.project.service;

import com.filippov.spring.project.entity.Car;

import java.util.List;

public interface CarService {
    public List<Car> getAllCars();
    public void saveCar(Car car);
    public Car getCar(int id);
    public void deleteCar (int id);
}

