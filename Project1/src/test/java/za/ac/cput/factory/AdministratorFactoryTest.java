package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Administrator;

import static org.junit.jupiter.api.Assertions.*;

class AdministratorFactoryTest {

    @Test
    void createAdministrator() {
        Administrator administrator = AdministratorFactory.createAdministrator("A101", "Sir", "aLot");
        System.out.println(administrator);
    }
}