/*
Keallan Saunders 219169357
ADP3 ASSIGNMENT1
DD: 10 APRIL 2022
BookingsFactoryTest.java
**************** DO NOT TOUCH ********************
 */
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Bookings;

import static org.junit.jupiter.api.Assertions.*;

class BookingsFactoryTest {
    @Test
    void createBooking(){
        Bookings bookings = BookingsFactory.createBookings("23 April 2022", "18:00 PM");
        assertNotNull(bookings);
        System.out.println(bookings);

    }
}