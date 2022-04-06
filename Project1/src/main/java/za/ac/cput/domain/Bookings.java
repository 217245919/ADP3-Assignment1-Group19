/*
Keallan Saunders 219169357
ADP3 ASSIGNMENT1
DD: 10 APRIL 2022
Bookings.java
**************** DO NOT TOUCH ********************
 */


package za.ac.cput.domain;

import java.util.Date;
import java.util.Timer;

public class Bookings {
    private String bookingId;
    private Date date;
    private String time;
    private String branchId;
    private String customerId;


    //Private constructors
    private Bookings(Builder builder){
        this.bookingId = builder.bookingId;
        this.date = builder.date;
        this.time = builder.time;
        this.branchId = builder.branchId;
        this.customerId = builder.customerId;
    }

    //Getters and Setters
    public String getBookingId() {return bookingId;}

    public void setBookingId(String bookingId) {this.bookingId = bookingId;}

    public Date getDate() {return date;}

    public void setDate(Date date) {this.date = date;}

    public String getTime() {return time;}

    public void setTime(String time) {this.time = time;}

    public String getBranchId() {return branchId;}

    public void setBranchId(String branchId) {this.branchId = branchId;}

    public String getCustomerId() {return customerId;}

    public void setCustomerId(String customerId) {this.customerId = customerId;}

// To String
    @Override
    public String toString() {
        return "Bookings{" +
                "bookingId='" + bookingId + '\'' +
                ", date=" + date +
                ", time='" + time + '\'' +
                ", branchId='" + branchId + '\'' +
                ", customerId='" + customerId + '\'' +
                '}';
    }


    public static class Builder{
        private String bookingId;
        private Date date;
        private String time;
        private String branchId;
        private String customerId;

        public Builder setBookingId(String bookingId){
            this.bookingId = bookingId;
            return this;
        }

        public Builder setDate(Date date){
            this.date = date;
            return this;
        }
        public Builder setTime(String time){
            this.time = time;
            return this;
        }
        public Builder setBranchId(String branchId){
            this.branchId = branchId;
            return this;
        }
        public Builder setCustomerId(String customerId){
            this.customerId = customerId;
            return this;
        }
        public Builder copy(Bookings bookings){
            this.bookingId = bookings.bookingId;
            this.date = bookings.date;
            this.time = bookings.time;
            this.branchId = bookings.branchId;
            this.customerId = bookings.customerId;
            return this;
        }
        public Bookings build(){return new Bookings(this);}
    }
}
