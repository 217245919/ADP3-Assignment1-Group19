package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.DeliveryBoy;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)

public class CarRepositoryTest {
    private static DeliveryBoyRepository repository = DeliveryBoyRepository.getRepository();
    private static DeliveryBoy deliveryBoy = DeliveryBoyFactory.createDeliveryBoy("123456", "Jake", "Evens","091 898 9765");
    @Test
    void a_create(){
        DeliveryBoy createdDelivery = repository.create(deliveryBoy);
        assertEquals(createdDelivery.getDelivBId(),deliveryBoy.getDelivBId());
        System.out.println("Created: " + createdDelivery);
    }

    @Test
    void b_read(){
        DeliveryBoy read = repository.read(deliveryBoy.getDelivBId());
        assertNotNull(read);
        System.out.println("Read: "+read);
    }

    @Test
    void c_update(){
        DeliveryBoy updated = new DeliveryBoy.Builder().copy(deliveryBoy).setDelivBId("123451").build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " +updated);
    }

    @Test
    void e_delete(){
        boolean deleted = repository.delete(deliveryBoy.getDelivBId());
        assertTrue(deleted);
        System.out.println("Deleted: "+deleted);
    }

    @Test
    void d_getAll(){
        System.out.println("Show All:");
        System.out.println(repository.getAll());
    }
}