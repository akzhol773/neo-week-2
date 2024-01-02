package org.example;

import java.util.List;

/**
 * Represents a customer, extending the Person class.
 * Stores additional customer-specific information such as customer ID and a list of reviews written by the customer.
 */
public class Customer extends Person {
    // Unique identifier for the customer
    private String customerID;
    // List of reviews written by the customer
    private List<Review> reviews;

    /**
     * Constructs a new Customer with specified personal and customer-specific details.
     *
     * @param firstName     The first name of the customer (inherited from Person)
     * @param lastName      The last name of the customer (inherited from Person)
     * @param contactNumber The contact number of the customer (inherited from Person)
     * @param email         The email address of the customer (inherited from Person)
     * @param customerID    The unique identifier for the customer
     * @param reviews       List of reviews written by the customer
     */
    public Customer(String firstName, String lastName, int contactNumber, String email, String customerID, List<Review> reviews) {
        super(firstName, lastName, contactNumber, email); // Call to the super class (Person) constructor
        this.customerID = customerID;
        this.reviews = reviews;
    }

    // Getters and setters for customer-specific fields


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

    /**
     * Returns a string representation of the Customer object, including both personal and customer-specific details.
     *
     * @return A string representation of the Customer object.
     */
    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", reviews=" + reviews +
                "} " + super.toString(); // Includes the toString output from the Person class
    }
}

