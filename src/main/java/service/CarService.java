package service;

import model.Car;

import java.util.List;

public interface CarService {
    public void addCarList(List<Car> carList);
    public List<Car> getAllCar();
}
