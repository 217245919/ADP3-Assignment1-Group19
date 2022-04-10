package za.ac.cput.repository;
/*
    CarDeliveryRepositoryTest.java
    Entity for the Upholstery
    Mogammad-Redar Behardien 216234107
    10 April 2022
 */


import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.CarDelivery;
import za.ac.cput.factory.CarDeliveryFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)

public class CarDeliveryRepositoryTest {
    private static CarDeliveryRepository repository = CarDeliveryRepository.getRepository();
    private static CarDelivery carDelivery = CarDeliveryFactory.createCarDelivery("123456", "231", "333");
    @Test
    void a_create(){
        CarDelivery createdDelivery = repository.create(carDelivery);
        assertEquals(createdDelivery.getCarDelivId(),carDelivery.getCarDelivId());
        System.out.println("Created: " + createdDelivery);
    }

    @Test
    void b_read(){
        CarDelivery read = repository.read(carDelivery.getCarDelivId());
        assertNotNull(read);
        System.out.println("Read: "+read);
    }

    @Test
    void c_update(){
        CarDelivery updated = new CarDelivery.Builder().copy(carDelivery).setCustomerId("123451").build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " +updated);
    }

    @Test
    void e_delete(){
        boolean deleted = repository.delete(carDelivery.getCarDelivId());
        assertTrue(deleted);
        System.out.println("Deleted: "+deleted);
    }

    @Test
    void d_getAll(){
        System.out.println("Show All:");
        System.out.println(repository.getAll());
    }
}
