/*
Keallan Saunders 219169357
ADP3 ASSIGNMENT1
DD: 10 APRIL 2022
BookingsFactory.java
**************** DO NOT TOUCH ********************
 */
package za.ac.cput.factory;

import za.ac.cput.domain.Bookings;
import za.ac.cput.util.Helper;

import java.util.Date;

public class BookingsFactory {
    public static Bookings createBookings(String date, String time){
        String bookingId = Helper.generatebookingId();
        String branchId = Helper.generatebranchId();
        String customerId = Helper.generatecustId();


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
