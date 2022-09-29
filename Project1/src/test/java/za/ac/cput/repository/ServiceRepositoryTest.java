package za.ac.cput.repository;

/* ServiceRepositoryTest.java
 Entity for the ServiceRepositoryTest
 Author: Tyler Yorke Fredericks (218047894)
 Date: 10 April 2022
*/

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Service;
import za.ac.cput.factory.ServiceFactory;


import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)

public class ServiceRepositoryTest {
    private static ServiceRepository repository = ServiceRepository.getRepository();
    private static Service service = ServiceFactory.createService("S102", "Minimal Package", "Package contains a simple exterior wash to vehicle.");

    @Test
    void a_create() {
        Service created = repository.create(service);
        assertEquals(service.getServiceId(), created.getServiceId());
        System.out.println("Create: " + created);
    }

    @Test
    void b_read() {
        Service read = repository.read(service.getServiceId());
        Assertions.assertEquals(service.getServiceId(), read.getServiceId());
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Service updated = new Service.Builder().copy(service).setServiceId("S102.2")
                .setServicePkg("Moderate Package")
                .setServiceDesc("Package contains an exterior wash and polish to vehicle.")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Update: " + updated);

    }

    @Test
    void e_delete() {
        boolean success = repository.delete(service.getServiceId());
        assertTrue(success);
        System.out.println("Success: " + success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all: ");
        System.out.println(repository.getAll());
    }
}