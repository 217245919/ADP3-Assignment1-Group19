package za.ac.cput.factory;

/*
  CustomerFactory.java
  Factory for the Customer
  Lyle Haines (217245919)
  10 April 2022
 */

import za.ac.cput.domain.Customer;
import za.ac.cput.util.Helper;

public class CustomerFactory {

    public static Customer createCustomer(String firstname, String lastname, String address, int cellnr) {

        String cusId = Helper.generateId();
        Customer customer = new Customer.Builder().setCusId(cusId)
                .setFirstname(firstname)
                .setLastname(lastname)
                .setAddress(address)
                .setCellnr(cellnr)
                .build();
        return customer;
    }
}
