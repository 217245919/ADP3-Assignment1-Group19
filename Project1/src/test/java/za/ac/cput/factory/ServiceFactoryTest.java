package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Service;

import static org.junit.jupiter.api.Assertions.*;

class ServiceFactoryTest {

    @Test
    void createService() {
        Service service = ServiceFactory.createService("S101", "Full Service", "Upholstery, Cleaning, Washing, everything tbh");
        assertNotNull(service);
    }

}