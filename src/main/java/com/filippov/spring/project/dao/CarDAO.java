package com.filippov.spring.project.dao;

import com.filippov.spring.project.entity.Car;

import java.util.List;

public interface CarDAO {

    public List<Car> getAllCar();
    public void saveCar(Car car);
    public Car getCar(int id);
    public void deleteCar (int id);
}
