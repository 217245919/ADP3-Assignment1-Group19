package za.ac.cput.service;


import org.springframework.stereotype.Service;
import za.ac.cput.domain.Car;
import za.ac.cput.repository.CarRepository;
import za.ac.cput.service.lookup.CarService;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {
    private final CarRepository repository;

    public CarServiceImpl(CarRepository repository){
        this.repository = repository;
    }
    @Override
    public Car save(Car car) {
        return this.repository.save(car);
    }

    @Override
    public Optional<Car> read(String s) {
        return this.repository.read(s);
    }

    @Override
    public void delete(Car car) {
        this.repository.delete(car);
    }

    @Override
    public List<Car> findAll(){
        return this.repository.findAll();
    }

    @Override
    public void deleteById(String id) {
        Optional<Car> car = read(id);
        if(car.isPresent()) delete(car.get());
    }

}

