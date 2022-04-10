package za.ac.cput.factory;

/*
  PaymentFactory.java
  Factory for the Payment
  Lyle Haines (217245919)
  06 April 2022
 */

import za.ac.cput.domain.Payment;
import za.ac.cput.util.Helper;

import java.util.Date;

public class PaymentFactory {

    public static Payment createPayment(int totalAmount, Date date) {

        String paymentId = Helper.generateId();
        Payment payment = new Payment.Builder().setPaymentId(paymentId)
                .setTotalAmount(totalAmount)
                .setDate(date)
                .build();
        return payment;
    }
}
