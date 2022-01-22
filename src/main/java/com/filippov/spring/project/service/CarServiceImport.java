package com.filippov.spring.project.service;
import com.filippov.spring.project.dao.CarDAO;
import com.filippov.spring.project.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarServiceImport implements CarService {
    @Autowired
    private CarDAO carDAO;

    @Override
    @Transactional
    public List<Car> getAllCars() {
        return carDAO.getAllCar();
    }

    @Override
    @Transactional
    public void saveCar(Car car) {
        carDAO.saveCar(car);
    }

    @Override
    @Transactional
    public Car getCar(int id) {
        return carDAO.getCar(id);
    }

    @Override
    @Transactional
    public void deleteCar(int id) {
        carDAO.deleteCar(id);
    }

}
