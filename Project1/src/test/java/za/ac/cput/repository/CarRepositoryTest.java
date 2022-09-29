package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Car;
import za.ac.cput.factory.CarFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)

public class CarRepositoryTest {
    private static CarRepository repository = CarRepository.getRepository();
    private static Car car = CarFactory.createCar("123456", "Toyota", "Blue");

    @Test
    void a_create(){
        Car created = repository.create(car);
        assertEquals(created.getCarRegId(),car.getCarRegId());
        System.out.println("Created: " + created);
    }

    @Test
    void b_read(){
        Car read = repository.read(car.getCarRegId());
        assertNotNull(read);
        System.out.println("Read: "+read);
    }

    @Test
    void c_update(){
        Car updated = new Car.Builder().copy(car).setCarModel("BMW").build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " +updated);
    }

    @Test
    void e_delete(){
        boolean deleted = repository.delete(car.getCarRegId());
        assertTrue(deleted);
        System.out.println("Deleted: "+deleted);
    }

    @Test
    void d_getAll(){
        System.out.println("Show All:");
        System.out.println(repository.getAll());
    }
}
