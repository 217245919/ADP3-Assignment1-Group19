package za.ac.cput.repository;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Car;
import za.ac.cput.domain.Upholstery;
import za.ac.cput.factory.CarFactory;
import za.ac.cput.factory.UpholsteryFactory;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)

public class UpholsteryRepositoryTest {
    private Upholstery upholstery;
    private UpholsteryRepository repository;

    @BeforeEach
    void setUp() {
        this.upholstery = UpholsteryFactory.build("test-id", "test-car");
        this.repository = UpholsteryRepository.upholsteryRepository();
        Upholstery saved = this.repository.save(this.upholstery);
        assertSame(this.upholstery, saved);
    }

    @AfterEach
    void tearDown(){
        this.repository.delete(this.upholstery);
        List<Upholstery> upholsteryList = this. repository.findAll();
        assertEquals(0, upholsteryList.size());
    }


    @Test
    void read() {
        Optional<Upholstery> read = this.repository.read(this.upholstery.getUpholsteryId());
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertSame(this.upholstery,read.get())
        );
    }

    @Test
    void findAll() {
        List<Upholstery> upholsteryList = this.repository.findAll();
        assertEquals(1, upholsteryList.size());
    }
}