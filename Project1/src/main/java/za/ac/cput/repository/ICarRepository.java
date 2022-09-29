package za.ac.cput.repository;
/*
    ICarRepository.java
    IRepository for the Car
    Wajedien Samuels (216287820)
    10 April 2022
 */

import za.ac.cput.domain.Car;

import java.util.Set;

public interface ICarRepository extends IRepository<Car, String> {
    public Set<Car> getAll();
}
