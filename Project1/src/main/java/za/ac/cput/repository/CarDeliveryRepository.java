package za.ac.cput.repository;
/*
    CarDeliveryRepository.java
    Repository for the Car Delivery
    Mogammad-Redar Behardien 216234107
    10 April 2022
 */

import za.ac.cput.domain.CarDelivery;

import java.util.HashSet;
import java.util.Set;



public class CarDeliveryRepository implements ICarDeliveryRepository {
    private static CarDeliveryRepository repository = null;
    private Set<CarDelivery> deliveries = null;

    public CarDeliveryRepository() { deliveries = new HashSet<CarDelivery>();}
    ///////////////////// Perform Singleton
    public static CarDeliveryRepository getRepository() {
        if (repository == null) {
            repository = new CarDeliveryRepository();
        }
        return repository;
    }


    ///////////////////////////Override Methods


    @Override
    public  CarDelivery create(CarDelivery carDelivery) {
        boolean deliver = deliveries.add(carDelivery);
        if (!deliver) {
            return null;
        }
        return carDelivery;
    }

    @Override
    public CarDelivery read(String carDelivId) {
        CarDelivery carDelivery = deliveries.stream()
                .filter(d -> d.getCarDelivId().equals(carDelivId))
                .findAny()
                .orElse(null);
        return carDelivery;
    }

    @Override
    public CarDelivery update(CarDelivery carDelivery) {
        CarDelivery oldCarDelivery = read(carDelivery.getCarDelivId());
        if(oldCarDelivery != null){
            deliveries.remove(oldCarDelivery);
            deliveries.add(carDelivery);
            return carDelivery;
        }
        return null;
    }

    @Override
    public boolean delete(String carDelivId) {
        CarDelivery IdToDelete = read(carDelivId);
        if(IdToDelete == null) return false;
        deliveries.remove(IdToDelete);return true;
    }

    @Override
    public Set<CarDelivery> getAll() {return deliveries;}
}