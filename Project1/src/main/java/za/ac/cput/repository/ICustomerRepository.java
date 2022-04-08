package za.ac.cput.repository;

/*
  ICustomerRepository.java
  IRepository for the Customer
  Lyle Haines (217245919)
  10 April 2022
 */

import za.ac.cput.domain.Customer;

import java.util.Set;

public interface ICustomerRepository extends IRepository<Customer, String>{

    public Set<Customer>getALL();
}
