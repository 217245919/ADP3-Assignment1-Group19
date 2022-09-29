package za.ac.cput.factory;

/* ServiceFactoryTest.java
 Entity for the ServiceFactoryTest
 Author: Tyler Yorke Fredericks (218047894)
 Date: 10 April 2022
*/

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Service;

import static org.junit.jupiter.api.Assertions.*;

class ServiceFactoryTest {

    @Test
    void createService() {
        Service service = ServiceFactory.createService("S101", "Full Service", "Upholstery, Cleaning, Washing");
        System.out.println(service);
    }

}