/*
Keallan Saunders 219169357
ADP3 ASSIGNMENT1
DD: 10 APRIL 2022
BookingsRepository.java
**************** DO NOT TOUCH ********************
 */
package za.ac.cput.repository;

import za.ac.cput.domain.Bookings;

import java.util.HashSet;
import java.util.Set;

public class BookingsRepository implements IBookingsRepository{
    private static BookingsRepository repository = null;
    private Set<Bookings> bookingDb = null;


    ///////////////////// Perform Singleton
    private BookingsRepository(){bookingDb = new HashSet<Bookings>();}
    ///////
    public static BookingsRepository getRepository() {
        if (repository == null) {
            repository = new BookingsRepository();
        }
        return repository;
    }
    ///////////////////////////Overide Methods


    @Override
    public  Bookings create(Bookings bookings) {
        boolean working = bookingDb.add(bookings);
        if (!working) {return null;}
        return bookings;
    }

    @Override
    public Bookings read(String bookingId) {
        Bookings bookings = bookingDb.stream()
                .filter(b -> b.getBookingId().equals(bookingId))
                .findAny()
                .orElse(null);
        return bookings;
    }

    @Override
    public Bookings update(Bookings bookings) {Bookings oldBooking = read(bookings.getBookingId());
        if(oldBooking != null){
            bookingDb.remove(oldBooking);
            bookingDb.remove(bookings);
            return bookings;
        }
       return null;
    }

    @Override
    public boolean delete(String bookingId) {
        Bookings ToDelete = read(bookingId);
        if(ToDelete == null)
            return false;
        bookingDb.remove(ToDelete);
        return true;
    }

    @Override
    public Set<Bookings> getAll() { return bookingDb; }
}
