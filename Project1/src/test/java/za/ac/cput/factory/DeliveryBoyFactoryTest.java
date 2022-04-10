package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.DeliveryBoy;

public class DeliveryBoyFactoryTest {

    @Test
    void createDeliveryBoy(){
        DeliveryBoy deliveryBoy = DeliveryBoyFactory.createDeliveryBoy("123456", "Jake", "Evens","091 898 9765");
        System.out.println(deliveryBoy);
    }
}
