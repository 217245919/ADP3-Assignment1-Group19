package za.ac.cput.domain;


public class DeliveryBoy {
    private String delivBId;
    private String delivBFname;
    private String delivBSname;
    private String delivBCellNr;

   //Private constructors
    private DeliveryBoy(Builder builder){
        this.delivBId = builder.delivBId;
        this.delivBFname = builder.delivBFname;
        this.delivBSname = builder.delivBSname;
        this.delivBCellNr = builder.delivBCellNr;
    }

    //Getters and Setters
    public String getDelivBId() {return this.delivBId;}
    public void setDelivBId(String ID) {this.delivBId = ID;}
    public String getDelivBFname() {return this.delivBFname;}
    public void setDelivBfname(String name) {this.delivBFname=name;}
    public String getDelivBSname() {return this.delivBSname;}
    public String getDelivBCellNr() {return this.delivBCellNr;}
    public void setDelivBfname(String name) {this.delivBFname=name;}
    public void setDelivBsname(String surname) {this.delivBSname=surname;}
    public void setDelivBfname(String cellNr) {this.delivBcCellNr=cellNr;}
   

    // To String


    @Override
    public String toString() {
        return "DeliveryBoy{" +
                "delivBId='" + delivBId + '\'' +

                ", delivBFname="+ delivBFname + '\'' +
                ", delivBSname='" + delivBSname + '\'' +
                ", delivBCellNr='"+ delivBCellNr + '\'' +
      }

    //Builder Set
    public static class Builder{
        private String delivBId;
        private String delivBFname;
        private String delivBSname;
        private String delivBCellNr;

        public Builder setDelivBId(String ID) {this.delivBId = ID;
            return this;}
        public Builder setDelivBFname(String name) {this.delivBFname=name;
            return this;}
        public Builder setDelivBSname(String surname) {this.delivBSname=surname;
            return this;}
        public Builder setDelivBCellNr(String cellNr) {this.delivBCellNr=cellNr;
            return this;}
       
        private Builder copy(DeliveryBoy dBoy){
            this.delivBId = dBoy.delivBId;
            this.delivBFname = dBoy.delivBFname;
            this.delivBSname = dBoy.delivBSname;
            this.delivBCellNr= dBoy.delivBCellNr;
            return this;
        }
        public DeliveryBoy build(){return new DeliveryBoy(this);}
    }
}
