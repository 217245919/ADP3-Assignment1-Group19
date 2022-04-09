package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Car;

public class CarFactoryTest {

    @Test
    void createCar(){
        Car car = CarFactory.createCar("123456", "Toyota", "Blue");
        System.out.println(car);
    }
}
