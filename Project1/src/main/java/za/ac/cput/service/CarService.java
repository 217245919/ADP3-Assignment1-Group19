package za.ac.cput.service.lookup;

import za.ac.cput.domain.Car;
import za.ac.cput.service.IService;

import java.util.List;

public interface CarService extends IService<Car,String> {

    void deleteById(String id);

    List<Car> findAll();
}
