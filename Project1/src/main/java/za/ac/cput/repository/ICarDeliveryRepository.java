package za.ac.cput.repository;
/*
    ICarDeliveryRepository.java
    IRepository for the CarDelivery
    Mogammad-Redar Behardien
    10 April 2022
 */

import za.ac.cput.domain.Car;

import java.util.Set;

public interface ICarDeliveryRepository extends IRepository<CarDelivery, String> {
    public Set<CarDelivery> getAll();
}
