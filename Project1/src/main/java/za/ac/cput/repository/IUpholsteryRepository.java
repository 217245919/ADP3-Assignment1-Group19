package za.ac.cput.repository;
/*
    IUpholsteryRepository.java
    IRepository for the Upholstery
    Wajedien Samuels (216287820)
    10 April 2022
 */

import za.ac.cput.domain.Upholstery;

import java.util.Set;

public interface IUpholsteryRepository extends IRepository<Upholstery,String> {
    public Set<Upholstery> getAll();

}
