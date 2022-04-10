/*
Mogammad-Redar Behardien 216234107
ADP3 ASSIGNMENT1
DD: 10 APRIL 2022
DeliveryBoyFactory.java
**************** DO NOT TOUCH ********************
 */
package za.ac.cput.factory;

import za.ac.cput.domain.DeliveryBoy;


public class DeliveryBoyFactory {
    public static DeliveryBoy createDeliveryBoy(String delivBId, String delivBFname, String delivBSname, String delivBCellNr){
        DeliveryBoy deliveryBoy= new DeliveryBoy.Builder()
                .setDelivBId(delivBId)
		        .setDelivBFname(delivBFname)
                .setDelivBSname(delivBSname)
                .setDelivBCellNr(delivBCellNr)
                .build();
        return deliveryBoy;
    }
}