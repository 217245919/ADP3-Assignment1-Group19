package za.ac.cput.factory;

/* AdministratorFactoryTest.java
 Entity for the AdministratorFactoryTest
 Author: Tyler Yorke Fredericks (218047894)
 Date: 10 April 2022
*/

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Administrator;

import static org.junit.jupiter.api.Assertions.*;

class AdministratorFactoryTest {

    @Test
    void createAdministrator() {
        Administrator administrator = AdministratorFactory.createAdministrator("A101", "John", "Smith");
        System.out.println(administrator);
    }
}