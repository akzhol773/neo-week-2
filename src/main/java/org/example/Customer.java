package org.example;

import java.util.List;

public class Customer  extends Person{
    private String customerID;
    private List<Review> reviews;

    public Customer(String firstName, String lastName, int contactNumber, String email, String customerID, List<Review> reviews) {
        super(firstName, lastName, contactNumber, email);
        this.customerID = customerID;
        this.reviews = reviews;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }


    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", reviews=" + reviews +
                "} " + super.toString();
    }
}
