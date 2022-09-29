package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Upholstery;
import za.ac.cput.factory.UpholsteryFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)

public class UpholsteryRepositoryTest {
    private static UpholsteryRepository repository = UpholsteryRepository.getRepository();
    private static Upholstery upholstery = UpholsteryFactory.createUpholstery("2468", "Seat", "Leather", "Brown");

    @Test
    void a_create(){
        Upholstery created = repository.create(upholstery);
        assertEquals(created.getUpholsteryId(),upholstery.getUpholsteryId());
        System.out.println("Created: " + created);
    }

    @Test
    void b_read(){
        Upholstery read = repository.read(upholstery.getUpholsteryId());
        assertNotNull(read);
        System.out.println("Read: "+read);
    }

    @Test
    void c_update(){
        Upholstery updated = new Upholstery.Builder().copy(upholstery).setUpholstColour("Grey").build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: "+updated);
    }

    @Test
    void e_delete(){
        boolean deleted = repository.delete(upholstery.getUpholsteryId());
        assertTrue(deleted);
        System.out.println("Deleted: "+deleted);
    }

    @Test
    void d_getAll(){
        System.out.println("Show All: ");
        System.out.println(repository.getAll());
    }
}
