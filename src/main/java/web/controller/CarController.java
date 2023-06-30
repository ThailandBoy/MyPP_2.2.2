package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String cars(ModelMap model, @RequestParam(value = "count", defaultValue = "all") String count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Car_1", 0001, "Red"));
        cars.add(new Car("Car_2", 0002, "Black"));
        cars.add(new Car("Car_3", 0003, "Yellow"));
        cars.add(new Car("Car_4", 0004, "White"));
        cars.add(new Car("Car_5", 0005, "Green"));
        if (!count.contains("all")) {
            List<Car> newCars = cars.stream().limit(Integer.parseInt(count)).toList();
            model.addAttribute("cars", newCars);
        } else {
            model.addAttribute("cars", cars);
        }

        return "cars";


    }
}
