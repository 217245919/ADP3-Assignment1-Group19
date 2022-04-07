package za.ac.cput.domain;

/*
  Payment.java
  Entity for the Payment
  Lyle Haines (217245919)
  10 April 2022
 */

import java.util.Date;

public class Payment {

    private int paymentId;
    private int totalAmount;
    private Date date;

    private Payment(Builder builder) {
        this.paymentId = builder.paymentId;
        this.totalAmount = builder.totalAmount;
        this.date = builder.date;

    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", totalAmount=" + totalAmount +
                ", date=" + date +
                '}';
    }

    public static class Builder {

        private int paymentId;
        private int totalAmount;
        private Date date;

        public Builder setPaymentId(int paymentId) {
            this.paymentId = paymentId;
            return this;
        }

        public Builder setTotalAmount(int totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        public Builder setDate(Date date) {
            this.date = date;
            return this;
        }

        public Builder copy(Payment payment) {
            this.paymentId = payment.paymentId;
            this.totalAmount = payment.totalAmount;
            this.date = payment.date;
            return this;
        }

        public Payment build() {
            return new Payment(this);
        }
    }
}
