package service;

import model.Car;

import java.util.List;

public class CarServiceImpl<T extends Car> implements CarService{

    private List<Car> car;

    @Override
    public void addCarList(List<Car> carList) {
        this.car.addAll(carList);
    }

    @Override
    public List<Car> getAllCar() {
        return car;
    }
}
