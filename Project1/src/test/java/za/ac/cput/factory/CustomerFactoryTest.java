package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Customer;

import static org.junit.jupiter.api.Assertions.*;

class CustomerFactoryTest {

    @Test
    void createCustomer() {

        Customer customer = CustomerFactory.createCustomer("Garth", "Simon"
                , "32 Kean drive"
                , Integer.parseInt("0746245634"));
        assertNotNull(customer);
        System.out.println(customer);
    }
}