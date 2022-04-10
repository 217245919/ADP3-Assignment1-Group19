package za.ac.cput.repository;
/*
    DeliveryBoyRepository.java
    Repository for the Car Delivery
    Mogammad-Redar Behardien 216234107
    10 April 2022
 */

import za.ac.cput.domain.DeliveryBoy;
import za.ac.cput.domain.Upholstery;

import java.util.HashSet;
import java.util.Set;

public class DeliveryBoyRepository implements IDeliveryBoyRepository{
    private static DeliveryBoyRepository repository = null;
    private Set<DeliveryBoy> deliveries = null;

    public DeliveryBoyRepository() { deliveries = new HashSet<DeliveryBoy>();}
    ///////////////////// Perform Singleton
    public static DeliveryBoyRepository getRepository() {
        if (repository == null) {
            repository = new DeliveryBoyRepository();
        }
        return repository;
    }


    ///////////////////////////Override Methods


    @Override
    public  DeliveryBoy create(DeliveryBoy deliveryBoy) {
        boolean deliver = deliveries.add(deliveryBoy);
        if (!deliver) {
            return null;
        }
        return deliveryBoy;
    }

    @Override
    public DeliveryBoy read(String delivBId) {
        for (DeliveryBoy D : deliveries)
            if(D.getDelivBId().equals(delivBId)){
                return D;
            }
        return null;
    }

    @Override
    public DeliveryBoy update(DeliveryBoy deliveryBoy) {
        DeliveryBoy oldDeliveryBoy = read(deliveryBoy.getDelivBId());
        if(oldDeliveryBoy != null){
            deliveries.remove(oldDeliveryBoy);
            deliveries.add(deliveryBoy);
            return deliveryBoy;
        }
        return null;
    }

    @Override
    public boolean delete(String delivBId) {
        DeliveryBoy IdToDelete = read(delivBId);
        if(IdToDelete == null)
            return false;
        deliveries.remove(IdToDelete);
        return true;
    }

    @Override
    public Set<DeliveryBoy> getAll() {return deliveries;}
}