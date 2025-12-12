package org.abb_tech.lesson5.service;

import org.abb_tech.lesson5.dto.CarDto;
import org.abb_tech.lesson5.exception.CarNotFoundException;
import org.abb_tech.lesson5.model.Car;
import org.abb_tech.lesson5.repository.CarRepository;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<CarDto> getCars() {
        return carRepository.getCars()
                .stream()
                .map(car -> CarDto.builder()
                        .id(car.getId())
                        .color(car.getColor())
                        .speed(car.getSpeed())
                        .build())
                .collect(Collectors.toList());
    }

    @Override
    public CarDto getCarById(int id) {
        Car car = carRepository.getCarById(id)
                .orElseThrow(() -> new CarNotFoundException("Car not found"));
        return CarDto.builder()
                .id(car.getId())
                .color(car.getColor())
                .speed(car.getSpeed())
                .build();
    }

    @Override
    public void saveCar(CarDto carDto) {
        carRepository.saveCar(new Car(carDto.getColor(), carDto.getSpeed()));
    }

    @Override
    public void deleteCarById(int id) {
        carRepository.deleteCarById(id);
    }

    @Override
    public void updateCar(int id, CarDto carDto) {
        Car updatedCar = new Car(carDto.getColor(), carDto.getSpeed());
        updatedCar.setDbCode("UpdatedCar");
        carRepository.updateCar(id, updatedCar);
    }
}
