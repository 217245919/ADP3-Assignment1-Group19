package za.ac.cput.repository;

/*
  IPaymentRepository.java
  IRepository for the Payment
  Lyle Haines (217245919)
  10 April 2022
 */

import za.ac.cput.domain.Payment;

import java.util.Set;

public interface IPaymentRepository extends IRepository<Payment, String>{

    public Set<Payment> getALL();
}
