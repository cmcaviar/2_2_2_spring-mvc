package web.Dao;

import org.springframework.stereotype.Repository;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDaoImpl implements CarDao {

    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "black", 111));
        cars.add(new Car(2, "green", 222));
        cars.add(new Car(3, "pink", 333));
        cars.add(new Car(4, "white", 444));
        cars.add(new Car(5, "red", 555));
    }

    public List<Car> showCars() {
        return cars;
    }

}
