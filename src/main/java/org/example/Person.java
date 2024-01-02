package org.example;

/**
 * Represents a person with basic contact information.
 * Stores personal details such as first name, last name, contact number, and email address.
 */
public class Person {
    // First name of the person
    private String firstName;
    // Last name of the person
    private String lastName;

    // Contact number of the person
    private int contactNumber;
    // Email address of the person
    private String email;

    /**
     * Constructs a new Person with the specified details.
     *
     * @param firstName     The first name of the person
     * @param lastName      The last name of the person
     * @param contactNumber The contact number of the person
     * @param email         The email address of the person
     */
    public Person(String firstName, String lastName, int contactNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    /**
     * Constructs a new Person with no details (default constructor).
     */
    public Person() {
    }

    // Getters and setters for each field


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

    /**
     * Returns a string representation of the Person object.
     * Includes details like first name, last name, contact number, and email address.
     *
     * @return A string representation of the Person object.
     */
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", contactNumber=" + contactNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
