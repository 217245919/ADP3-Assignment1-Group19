/*
Keallan Saunders 219169357
ADP3 ASSIGNMENT1
DD: 10 APRIL 2022
Location.java
**************** DO NOT TOUCH ********************
 */package za.ac.cput.domain;

import java.util.Date;

public class Location {
    private String branchId;
    private String branchLoca;
    private String branchName;
    private String branchCellno;
    private String delivBId;


    //////////////////////Private constructors
    private Location(Builder builder){
        this.branchId = builder.branchId;
        this.branchLoca = builder.branchLoca;
        this.branchName = builder.branchName;
        this.branchCellno = builder.branchCellno;
        this.delivBId = builder.delivBId;
    }

    //////////////////////// Getters And Setters
    public String getBranchId() {return branchId;}
    public void setBranchId(String branchId) {this.branchId = branchId;}
    public String getBranchLoca() {return branchLoca;}
    public void setBranchLoca(String branchLoca) {this.branchLoca = branchLoca;}
    public String getBranchName() {return branchName;}
    public void setBranchName(String branchName) {this.branchName = branchName;}
    public String getBranchCellno() {return branchCellno;}
    public void setBranchCellno(String branchCellno) {this.branchCellno = branchCellno;}
    public String getDelivBId() {return delivBId;}
    public void setDelivBId(String delivBId) {this.delivBId = delivBId;}

    ///////////////////////// To String

    @Override
    public String toString() {
        return "Location{" +
                "branchId='" + branchId + '\'' +
                ", branchLoca='" + branchLoca + '\'' +
                ", branchName='" + branchName + '\'' +
                ", branchCellno='" + branchCellno + '\'' +
                ", delivBId='" + delivBId + '\'' +
                '}';
    }
    //////////////////////////////Builder Set
    public static class Builder{
        private String branchId;
        private String branchLoca;
        private String branchName;
        private String branchCellno;
        private String delivBId;


        public Location.Builder setBranchId(String branchId){
            this.branchId = branchId;
            return this;
        }
        public Location.Builder setBranchLoca(String branchLoca){
            this.branchLoca = branchLoca;
            return this;
        }

        public Location.Builder setBranchName(String branchName){
            this.branchName = branchName;
            return this;
        }
        public Location.Builder setBranchCellno(String branchCellno){
            this.branchCellno = branchCellno;
            return this;
        }

        public Location.Builder setDelivBId(String delivBId){
            this.delivBId = delivBId;
            return this;
        }
        public Location.Builder copy(Location location){
            this.branchId = location.branchId;
            this.branchLoca = location.branchLoca;
            this.branchName = location.branchName;
            this.branchCellno = location.branchCellno;
            this.delivBId = location.delivBId;
            return this;
        }
        public Location build(){return new Location(this);}
    }
//////////////////////////// END













}
