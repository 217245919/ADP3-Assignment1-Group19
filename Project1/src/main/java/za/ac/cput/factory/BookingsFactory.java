/*
Keallan Saunders 219169357
ADP3 ASSIGNMENT1
DD: 10 APRIL 2022
BookingsFactory.java
**************** DO NOT TOUCH ********************
 */
package za.ac.cput.factory;

import za.ac.cput.domain.Bookings;

import java.util.Date;

public class BookingsFactory {
    public static Bookings createBookings(String bookingId, String date, String time, String branchId, String customerId){
        //String bookingId = Helper.generateId();
        //String branchId = Helper.generateId();
        //String customerId = Helper.generateId();
        Bookings bookings = new Bookings.Builder()
                .setBookingId(bookingId)
                .setDate(date)
                .setTime(time)
                .setBranchId(branchId)
                .setCustomerId(customerId)
                .build();
        return bookings;
    }
}
