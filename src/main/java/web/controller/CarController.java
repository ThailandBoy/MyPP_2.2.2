package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import web.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String cars(ModelMap model, @RequestParam(defaultValue = "5") String count) {

        carService.addCar(new Car(1, "Car_1", 1231));
        carService.addCar(new Car(2, "Car_2", 3342));
        carService.addCar(new Car(3, "Car_3", 5683));
        carService.addCar(new Car(4, "Car_4", 7234));
        carService.addCar(new Car(5, "Car_5", 6747));

        List<Car> newCars = carService.getCarList(Integer.parseInt(count));
        model.addAttribute("cars", newCars);

        return "cars";
    }
}
