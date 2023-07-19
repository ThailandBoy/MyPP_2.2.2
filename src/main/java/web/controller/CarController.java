package web.controller;

import web.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String cars(ModelMap model, @RequestParam(value = "count", defaultValue = "all") String count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1,"Car_1", 1231));
        cars.add(new Car(2,"Car_2", 3342));
        cars.add(new Car(3,"Car_3", 5683));
        cars.add(new Car(4,"Car_4", 7234));
        cars.add(new Car(5,"Car_5", 6747));
        if (!count.contains("all")) {
            List<Car> newCars = cars.stream().limit(Integer.parseInt(count)).toList();
            model.addAttribute("cars", newCars);
        } else {
            model.addAttribute("cars", cars);
        }

        return "cars";


    }
}
