package com.neobis.entity.person;

import javax.persistence.*;
import java.util.Objects;
/**
 * Represents a customer, extending the Person class.
 * This class adds a unique customer ID to the basic personal information inherited from Person.
 */
@Entity
@Table(name = "customer")
public class Customer extends Person {


    /**
     * Constructor to initialize a Customer object with personal and customer-specific attributes.
     * This constructor uses the super() method to initialize fields inherited from the Person class.
     *
     * @param firstName The first name of the customer.
     * @param lastName The last name of the customer.
     * @param contactNumber The contact number of the customer.
     * @param email The email address of the customer.
     * @param id The unique identifier for the customer.
     */

    public Customer(Long id, String firstName, String lastName, int contactNumber, String email) {
        super(id, firstName, lastName, contactNumber, email);
    }

    /**
     * Default constructor.
     * Creates an empty Customer object. Useful when customer details are set using setters.
     */
    public Customer() {
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
                "} " + super.toString();
    }
}
