package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class CarDaoImpl implements CarDao {

    private List<Car> carList = new ArrayList<>();

    public CarDaoImpl() {
    }

    @Override
    public void addCar(Car car) {
        carList.add(car);
    }

    @Override
    public Car getCar(long id) {
        return carList.stream().filter(car -> car.getId() == id).findFirst().get();
    }

    @Override
    public List<Car> getCarList(long count) {
        return carList.stream().limit(count).toList();
    }

    @Override
    public List<Car> getAllCar() {
        return carList;
    }
}
