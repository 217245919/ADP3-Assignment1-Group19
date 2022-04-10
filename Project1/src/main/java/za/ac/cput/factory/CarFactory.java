package za.ac.cput.factory;

import za.ac.cput.domain.Car;

public class CarFactory {

    public static Car createCar(int carRegId, String carModel, String carColour){

        Car car = new Car.Builder()
                .setCarRegId(carRegId)
                .setCarModel(carModel)
                .setCarColour(carColour)
                .build();
        return car;
    }
}
