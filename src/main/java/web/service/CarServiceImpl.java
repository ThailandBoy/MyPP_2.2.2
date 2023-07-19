package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    @Autowired
    CarDao carDao;

    @Override
    public void addCar(Car car) {
        carDao.addCar(car);
    }

    @Override
    public Car getCar(long id) { return carDao.getCar(id); }

    @Override
    public List<Car> getAllCar() {
        return null;
    }
}
