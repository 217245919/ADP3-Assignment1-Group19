package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Payment;

import static org.junit.jupiter.api.Assertions.*;

class PaymentFactoryTest {

    @Test
    void createPayment() {

        Payment payment = PaymentFactory.createPayment(Integer.parseInt("100"), "23 March 2022");
        assertNotNull(payment);
        System.out.println(payment);
    }
}