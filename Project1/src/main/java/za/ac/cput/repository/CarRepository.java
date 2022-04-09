package za.ac.cput.repository;
/*
    CarRepository.java
    Repository for the Car
    Wajedien Samuels (216287820)
    10 April 2022
 */

import za.ac.cput.domain.Car;

import java.util.HashSet;
import java.util.Set;

public class CarRepository implements ICarRepository {
    private static CarRepository repository = null;
    private Set<Car> carDB=null;

    public CarRepository() { carDB = new HashSet<Car>();}

    public static CarRepository getRepository(){
        if (repository == null){
            repository = new CarRepository();
        }
        return repository;
    }

    @Override
    public Car create(Car car) {
        boolean created = carDB.add(car);
        if (!created)
        return null;
        return car;
    }

    @Override
    public Car read(String carRegId) {
        for (Car c : carDB)
            if(c.getCarRegId().equals(carRegId)){
                return c;
            }
        return null;
    }

    @Override
    public Car update(Car car) {
        Car oldCar = read(car.getCarRegId());
        if(oldCar != null){
            carDB.remove(oldCar);
            carDB.add(car);
            return car;
        }
        return null;
    }

    @Override
    public boolean delete(String carRegId) {
        Car carToDelete = read(carRegId);
        if(carToDelete == null)
            carDB.remove(carToDelete);
        return true;
    }

    @Override
    public Set<Car> getAll() { return carDB;}
}
