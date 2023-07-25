package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;

    @Override
    public void addCar(Car car) {
        carDao.addCar(car);
    }

    @Override
    public Car getCar(long id) {
        return carDao.getCar(id);
    }

    @Override
    public List<Car> getCarList(long count) {
        return carDao.getCarList(count);
    }

    @Override
    public List<Car> getAllCar() {
        return carDao.getAllCar();
    }
}
