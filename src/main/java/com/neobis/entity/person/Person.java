package com.neobis.entity.person;

import javax.persistence.*;
import java.util.Objects;

/**
 * Represents a person with basic contact information.
 * Stores personal details such as first name, last name, contact number, and email address.
 */

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    // First name of the person
    private String firstName;
    // Last name of the person
    private String lastName;

    // Contact number of the person
    private int contactNumber;
    // Email address of the person
    private String email;


    /**
     * Constructor to initialize a Person object with all its attributes.
     * This is useful when all person details are known and need to be set at the time of object creation.
     *
     * @param firstName The first name of the person.
     * @param lastName The last name of the person.
     * @param contactNumber The contact number of the person.
     * @param email The email address of the person.
     */
    public Person(Long id, String firstName, String lastName, int contactNumber, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    /**
     * Default constructor.
     * Creates an empty Person object. Useful when person details are set using setters.
     */
    public Person() {
    }



    // Getter and Setter methods for each field

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    // Override methods from the Object class

    /**
     * Determines if this Person is equal to another object.
     * Two Persons are considered equal if their first names, last names, contact numbers, and emails are equal.
     *
     * @param o The object to compare with this Person.
     * @return true if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return getContactNumber() == person.getContactNumber() && Objects.equals(getId(), person.getId()) && Objects.equals(getFirstName(), person.getFirstName()) && Objects.equals(getLastName(), person.getLastName()) && Objects.equals(getEmail(), person.getEmail());
    }

    /**
     * Generates a hash code for the Person.
     * This is used in collections like HashMap.
     *
     * @return A hash code value for the Person.
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName(), getContactNumber(), getEmail());
    }

    /**
     * Returns a string representation of the Person object.
     * Includes the person's first name, last name, contact number, and email.
     *
     * @return A string representation of the Person object.
     */
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", contactNumber=" + contactNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
