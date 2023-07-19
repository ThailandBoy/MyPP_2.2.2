package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    public void addCar(Car car);
    public Car getCar(long id);
    public List<Car> getAllCar();
}
