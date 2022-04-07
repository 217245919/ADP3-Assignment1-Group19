package za.ac.cput.domain;


public class CarDelivery {
    private String carDelivId;
    private String delivBId;
    private String customerId;

   //Private constructors
    private CarDelivery(Builder builder){
        this.delivBId = builder.delivBId;
        this.customerId = builder.customerId;
    }

    //Getters and Setters
    public String getDelivBId() {return this.delivBId;}
    public void setDelivBId(String ID) {this.delivBId = ID;}
    public String getCarDelivId() {return this.carDelivId;}
    public void setCarDelivId(String ID) {this.carDelivId = ID;}
    public String getCustomerId() {return this.customerId;}
    public void setCustomerId(String ID) {this.customerId = ID;}
    
    // To String
    @Override
    public String toString() {
        return 
                "Deliver boy Id is: " + this.delivBId + "'\'" +
                "Car Delivery ID: =" + this.carDelivId + '\'' +
                "Customer ID :" + this.customerId + '\'';
    }

    //Builder Set
    public static class Builder{
        private String carDelivId;
        private String delivBId;
        private String customerId;

        public Builder setDelivBId(String ID) {this.delivBId = ID;
            return this;}
        public Builder setCarDelivId(String ID) {this.carDelivId = ID;
            return this;}
        public Builder setCustomerId(String ID) {this.customerId = ID;
            return this;}
       
        private Builder copy(CarDelivery cDelivery){
            this.delivBId = cDelivery.delivBId;
            this.carDelivId = cDelivery.carDelivId;
            this.customerId = cDelivery.customerId;
            return this;
        }
        public CarDelivery build(){return new CarDelivery(this);}
    }
}
