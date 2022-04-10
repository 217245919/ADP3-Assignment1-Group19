package za.ac.cput.repository;

/*
  CustomerRepository.java
  Repository for the Customer
  Lyle Haines (217245919)
  10 April 2022
 */

import za.ac.cput.domain.Customer;

import java.util.Set;

public class CustomerRepository implements ICustomerRepository {

    private static CustomerRepository repository = null;
    private Set<Customer> cusDB = null;

    public static CustomerRepository getRepository() {

        if (repository == null) {
            repository = new CustomerRepository();
        }
        return repository;
    }

    @Override
    public Customer create(Customer customer) {
        boolean created = cusDB.add(customer);
        if (!created)
            return null;
        return customer;
    }

    @Override
    public Customer read(String cusId) {
        Customer customer = cusDB.stream()
                .filter(e -> e.getCusId().equals(cusId))
                .findAny()
                .orElse(null);
        return customer;

    }

    @Override
    public Customer update(Customer customer) {
        Customer oldCustomer = read(customer.getCusId());
        if (oldCustomer != null) {
            cusDB.remove(oldCustomer);
            cusDB.add(customer);
            return customer;
        }
        return null;
    }

    @Override
    public boolean delete(String cusId) {
        Customer deleteCus = read(cusId);
        if (deleteCus == null)
            return false;
        cusDB.remove(deleteCus);
        return true;
    }


    @Override
    public Set<Customer> getALL() {
        return cusDB;
    }
}