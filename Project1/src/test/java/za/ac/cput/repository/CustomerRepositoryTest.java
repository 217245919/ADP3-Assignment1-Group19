package za.ac.cput.repository;

/*
  CustomerRepositoryTest.java
  Repository for the Customer
  Lyle Haines (217245919)
  10 April 2022
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Customer;
import za.ac.cput.factory.CustomerFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class CustomerRepositoryTest {

    private static CustomerRepository repository = CustomerRepository.getRepository();
    private static Customer customer = CustomerFactory.createCustomer("Gino", "Haines"
            , "23 York street"
            , Integer.parseInt("0724518364"));

    @Test
    void create() {
        Customer created = repository.create(customer);
        assertEquals(customer.getCusId(), created.getCusId());
        System.out.println("Create: " + created);
    }

    @Test
    void read() {
        Customer read = repository.read(customer.getCusId());
        System.out.println(read);
        System.out.println("Read: " + read);
    }

    @Test
    void update() {
        Customer updated = new Customer.Builder().copy(customer).setFirstname("Theodore").setLastname("Walter")
                .setAddress("40 Arms road")
                .setCellnr(Integer.parseInt("0744563294"))
                .build();
        System.out.println(repository.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void delete() {
        boolean success = repository.delete(customer.getCusId());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void getALL() {
        System.out.println("Show all: ");
        System.out.println(repository.getALL());
    }
}