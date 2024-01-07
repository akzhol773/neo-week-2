package com.neobis.entity.person;

import java.util.Objects;
/**
 * Represents a customer, extending the Person class.
 * This class adds a unique customer ID to the basic personal information inherited from Person.
 */

public class Customer extends Person {

    // Unique identifier for the customer
    private String customerId;

    /**
     * Constructor to initialize a Customer object with personal and customer-specific attributes.
     * This constructor uses the super() method to initialize fields inherited from the Person class.
     *
     * @param firstName The first name of the customer.
     * @param lastName The last name of the customer.
     * @param contactNumber The contact number of the customer.
     * @param email The email address of the customer.
     * @param customerId The unique identifier for the customer.
     */

    public Customer(String firstName, String lastName, int contactNumber, String email, String customerId) {
        super(firstName, lastName, contactNumber, email);
        this.customerId = customerId;
    }

    /**
     * Default constructor.
     * Creates an empty Customer object. Useful when customer details are set using setters.
     */
    public Customer() {
    }


    // Getter and Setter methods for customerId
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }



    /**
     * Determines if this Customer is equal to another object.
     * Equality is based on both the inherited Person fields and the Customer-specific field (customerId).
     *
     * @param o The object to compare with this Customer.
     * @return true if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer customer)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getCustomerId(), customer.getCustomerId());
    }


    /**
     * Generates a hash code for the Customer.
     * Includes hash codes from both the inherited Person fields and the Customer-specific field.
     *
     * @return A hash code value for the Customer.
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCustomerId());
    }

    /**
     * Returns a string representation of the Customer object.
     * Includes details from both the Person superclass and the Customer-specific field.
     *
     * @return A string representation of the Customer object.
     */

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                "} " + super.toString();
    }
}
