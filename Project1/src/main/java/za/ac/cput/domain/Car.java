package za.ac.cput.domain;

/*
    Car.java
    Entity for the Car
    Wajedien Samuels (216287820)
    10 April 2022
 */

public class Car {

    private String carRegId;
    private String carModel;
    private String carColour;

    private Car(Builder builder) {
        this.carRegId = builder.carRegId;
        this.carModel = builder.carModel;
        this.carColour = builder.carColour;

    }

    public String getCarRegId(){
        return carRegId;
    }

    public void setCarRegId(String carRegId){
        this.carRegId = carRegId;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getColour() {
        return carColour;
    }

    public void setColour(String colour) {
        this.carColour = colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carRegId=" + carRegId +
                ", carModel='" + carModel + '\'' +
                ", colour='" + carColour + '\'' +
                '}';
    }

    public static class Builder {

        private String carRegId;
        private String carModel;
        private String carColour;

        public Builder setCarRegId(String carRegId) {
            this.carRegId = carRegId;
            return this;
        }

        public Builder setCarModel(String carModel) {
            this.carModel = carModel;
            return this;
        }

        public Builder setCarColour(String carColour) {
            this.carColour = carColour;
            return this;
        }

        public Builder copy(Car car) {
            this.carRegId=car.carRegId;
            this.carModel=car.carModel;
            this.carColour=car.carColour;
            return this;
        }

        public Car build(){return new Car(this);}
    }

}

