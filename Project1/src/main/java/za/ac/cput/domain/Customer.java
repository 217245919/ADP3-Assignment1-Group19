package za.ac.cput.domain;

/*
  Customer.java
  Entity for the Customer
  Lyle Haines (217245919)
  10 April 2022
 */
public class Customer {

    private int cusId;
    private String firstname;
    private String lastname;
    private String address;
    private int cellnr;

    private Customer(Builder builder) {
        this.cusId = builder.cellnr;
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.address = builder.address;
        this.cellnr = builder.cellnr;
    }

    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCellnr() {
        return cellnr;
    }

    public void setCellnr(int cellnr) {
        this.cellnr = cellnr;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cusId=" + cusId +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", cellnr=" + cellnr +
                '}';
    }

    public static class Builder {

        private int cusId;
        private String firstname;
        private String lastname;
        private String address;
        private int cellnr;

        public Builder setCusId(int cusId) {
            this.cusId = cusId;
            return this;
        }

        public Builder setFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder setLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setCellnr(int cellnr) {
            this.cellnr = cellnr;
            return this;
        }

        public Builder copy(Customer customer) {
            this.cusId = customer.cusId;
            this.firstname = customer.firstname;
            this.lastname = customer.lastname;
            this.address = customer.address;
            this.cellnr = customer.cellnr;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }
}
