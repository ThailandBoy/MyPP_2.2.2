package web.dao;

import web.model.Car;

import java.util.List;
import java.util.Optional;

public interface CarDao {
    void addCar(Car car);

    Car getCar(long id);

    List<Car> getCarList(long count);

    List<Car> getAllCar();
}
