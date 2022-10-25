package web.Service;


import org.springframework.stereotype.Service;
import web.Dao.CarDao;
import web.Model.Car;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
private final CarDao carDao;


    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> showCars(int count) {
        return carDao.showCars().stream().limit(count).toList();
    }
}
