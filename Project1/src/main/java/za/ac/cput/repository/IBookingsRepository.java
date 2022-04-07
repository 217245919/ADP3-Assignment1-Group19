/*
Keallan Saunders 219169357
ADP3 ASSIGNMENT1
DD: 10 APRIL 2022
IBookingsRepository.java
**************** DO NOT TOUCH ********************
 */
package za.ac.cput.repository;

import za.ac.cput.domain.Bookings;

import java.util.Set;

public interface IBookingsRepository extends IRepository<Bookings, String> {
    public Set<Bookings> getAll();
}
