package web.dao;

import web.model.Car;

import java.util.List;
import java.util.Optional;

public interface CarDao {
    public void addCar(Car car);
    public Car getCar(long id);
    public List<Car> getAllCar();
}
