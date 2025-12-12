package org.abb_tech.lesson5.repository;

import org.abb_tech.lesson5.model.Car;

import java.util.List;
import java.util.Optional;

public interface CarRepository {
    List<Car> getCars();
    Optional<Car> getCarById(int id);
    void saveCar(Car car);
    void deleteCarById(int id);
    void updateCar(int id, Car car);
}
