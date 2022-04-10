package za.ac.cput.repository;

/*
  PaymentRepository.java
  Repository for the Payment
  Lyle Haines (217245919)
  10 April 2022
 */

import za.ac.cput.domain.Payment;

import java.util.HashSet;
import java.util.Set;

public class PaymentRepository implements IPaymentRepository {

    private static PaymentRepository repository = null;
    private Set<Payment> paymentDB = null;
    private PaymentRepository() {
        paymentDB = new HashSet<Payment>();
    }


    public static PaymentRepository getRepository() {

        if (repository == null) {
            repository = new PaymentRepository();
        }
        return repository;
    }


    @Override
    public Payment create(Payment payment) {
        boolean created = paymentDB.add(payment);
        if (!created)
            return null;
        return payment;

    }

    @Override
    public Payment read(String paymentId) {
        Payment payment= paymentDB.stream()
                .filter(e -> e.getPaymentId().equals(paymentId))
                .findAny()
                .orElse(null);
        return payment;
    }

    @Override
    public Payment update(Payment payment) {
        Payment oldPayment = read(payment.getPaymentId());
        if (oldPayment != null) {
            paymentDB.remove(oldPayment);
            paymentDB.add(payment);
            return payment;
        }
        return null;
    }

    @Override
    public boolean delete(String paymentId) {
        Payment deletePayment = read(paymentId);
        if (deletePayment == null)
            return false;
        paymentDB.remove(deletePayment);
        return true;
    }

    @Override
    public Set<Payment> getALL() {
        return paymentDB;
    }
}