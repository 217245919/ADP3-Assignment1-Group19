/*
Mogammad-Redar Behardien 
ADP3 ASSIGNMENT1
DD: 10 APRIL 2022
CarDeliveryFactory.java
**************** DO NOT TOUCH ********************
 */
package za.ac.cput.factory;

import za.ac.cput.domain.CarDelivery;


public class CarDeliveryFactory {
    public static CarDelivery createCarDelivery(String delivBId, String carDelivId, String customerId){
        CarDelivery carDelivery= new CarDelivery.Builder()
                .setDelivBId(delivBId)
                .setCarDelivId(carDelivId)
                .setCustomerId(customerId)
                .build();
        return carDelivery;
    }
}
