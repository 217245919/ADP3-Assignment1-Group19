/*
Keallan Saunders 219169357
ADP3 ASSIGNMENT1
DD: 10 APRIL 2022
BookingsRepositoryTestMethod.java
**************** DO NOT TOUCH ********************
 */
package za.ac.cput.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Bookings;
import za.ac.cput.factory.BookingsFactory;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;


import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class BookingsRepositoryTest {
    private static BookingsRepository repository = BookingsRepository.getRepository();
    private static Bookings bookings = BookingsFactory.createBookings("13 April 2022", "14:00 PM");


    //////////////Create
    @Test
    void a_create() {
        Bookings created = repository.create(bookings);
        assertEquals(bookings.getBookingId(), created.getBookingId());
        System.out.println("Create: " + created);
    }

    /////////////Read
    @Test
    void b_read() {
        Bookings read = repository.read(bookings.getBookingId());
        Assertions.assertEquals(bookings.getBookingId(), read.getBookingId());
        // assertNotNull(read);
        System.out.println("Read: " + read);
    }

    ////////////Update
    @Test
    void c_update() {
        Bookings updated = new Bookings.Builder().copy(bookings).setDate("14 December 2022")
                .setTime("11:00 AM")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " + updated);
    }

    ////////////Delete
    @Test
    void e_delete() {
        boolean success = repository.delete(bookings.getBookingId());
        assertTrue(success);
        System.out.println("Deleted: " + bookings);
    }

    ////////////GetAll
    @Test
    void d_getAll() {
        System.out.println("Show all: ");
        System.out.println(repository.getAll());
    }

}