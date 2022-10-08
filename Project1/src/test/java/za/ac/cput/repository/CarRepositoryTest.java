package za.ac.cput.repository;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Car;
import za.ac.cput.factory.CarFactory;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)

public class CarRepositoryTest {
    private Car car;
    private CarRepository repository;

    @BeforeEach void setUp() {
        this.car = CarFactory.build("test-id", "test-car");
        this.repository = CarRepository.carRepository();
        Car saved = this.repository.save(this.car);
        assertSame(this.car, saved);
    }

    @AfterEach void tearDown(){
        this.repository.delete(this.car);
        List<Car> carList = this. repository.findAll();
        assertEquals(0, carList.size());
    }


    @Test
    void read() {
        Optional<Car> read = this.repository.read(this.car.getCarRegId());
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertSame(this.car,read.get())
        );
    }

    @Test
    void findAll() {
        List<Car> carList = this.repository.findAll();
        assertEquals(1, carList.size());
    }
}
