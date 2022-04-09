package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.CarDelivery;

public class CarDeliveryFactoryTest {

    @Test
    void createCarDelivery(){
        CarDelivery carDelivery = CarDeliveryFactory.createCarDelivery("123456", "231", "333");
        System.out.println(carDelivery);
    }
}
