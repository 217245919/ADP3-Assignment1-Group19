package za.ac.cput.repository;
/*
    CarRepository.java
    Repository for the Car
    Wajedien Samuels (216287820)
    10 April 2022
 */

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Car;

import java.util.*;

@Repository
public class CarRepository implements ICarRepository<Car, String> {
    private final List<Car> carList;

    public CarRepository() {
        this.carList = new ArrayList<>();
    }

    public static CarRepository carRepository() {
        return null;
    }

    public Car save(Car car) {
        Optional<Car> read = read(car.getCarRegId());
        if(read.isPresent()) {
            delete(read.get());
        }
        this.carList.add(car);
        return car;
    }

    public Optional<Car> read(String id){
        return this.carList.stream().filter(g -> g.getCarRegId().equalsIgnoreCase(id))
                .findFirst();
    }

    public void delete(Car car){
        this.carList.remove(car);
    }


    public List<Car> findAll() {
        return null;
    }
}