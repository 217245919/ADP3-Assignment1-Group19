package za.ac.cput.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Administrator;
import za.ac.cput.factory.AdministratorFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)

class AdministratorRepositoryTest {
    private static AdministratorRepository repository = AdministratorRepository.getRepository();
    private static Administrator administrator = AdministratorFactory.createAdministrator("A102", "John", "Smith");

    @Test
    void a_create() {
        Administrator created = repository.create(administrator);
        assertEquals(administrator.getAdminId(), created.getAdminId());
        System.out.println("Create: " + created);
    }

    @Test
    void b_read() {
        Administrator read = repository.read(administrator.getAdminId());
        Assertions.assertEquals(administrator.getAdminId(), read.getAdminId());
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Administrator updated = new Administrator.Builder().copy(administrator).setAdminId("A102.1")
                .setAdminFName("Jan")
                .setAdminSName("Smit")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean success = repository.delete(administrator.getAdminId());
        assertTrue(success);
        System.out.println("Success: " + success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all: ");
        System.out.println(repository.getAll());
    }
}