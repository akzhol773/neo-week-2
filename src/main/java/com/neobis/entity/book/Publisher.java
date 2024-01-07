package com.neobis.entity.book;

import java.util.Objects;

/**
 * Represents a publisher of books.
 * This class contains information about the publisher such as their ID, name, address, and phone number.
 */
public class Publisher {

    // Fields of the Publisher class
    private String publisherId;  // Unique identifier for the publisher
    private String name;         // Name of the publisher
    private String address;      // Address of the publisher
    private int phoneNumber;     // Phone number of the publisher

    /**
     * Constructor to initialize a Publisher object with all its attributes.
     *
     * @param publisherId Unique identifier for the publisher.
     * @param name Name of the publisher.
     * @param address Address of the publisher.
     * @param phoneNumber Phone number of the publisher.
     */
    public Publisher(String publisherId, String name, String address, int phoneNumber) {
        this.publisherId = publisherId;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Default constructor.
     * Creates an empty Publisher object.
     */
    public Publisher() {
    }

    // Getter and Setter methods for each field

    /**
     * Gets the publisher ID.
     *
     * @return The publisher ID.
     */
    public String getPublisherId() {
        return publisherId;
    }

    /**
     * Sets the publisher ID.
     *
     * @param publisherId The new publisher ID.
     */
    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }

    /**
     * Gets the name of the publisher.
     *
     * @return The name of the publisher.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the publisher.
     *
     * @param name The new name of the publisher.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the address of the publisher.
     *
     * @return The address of the publisher.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address of the publisher.
     *
     * @param address The new address of the publisher.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the phone number of the publisher.
     *
     * @return The phone number of the publisher.
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the phone number of the publisher.
     *
     * @param phoneNumber The new phone number of the publisher.
     */
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Override methods

    /**
     * Determines if this Publisher is equal to another object.
     * Two Publishers are considered equal if all their fields are equal.
     *
     * @param o The object to compare with this Publisher.
     * @return true if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Publisher publisher)) return false;
        return getPhoneNumber() == publisher.getPhoneNumber() &&
                Objects.equals(getPublisherId(), publisher.getPublisherId()) &&
                Objects.equals(getName(), publisher.getName()) &&
                Objects.equals(getAddress(), publisher.getAddress());
    }

    /**
     * Generates a hash code for the Publisher.
     * This is used in collections like HashMap.
     *
     * @return A hash code value for the Publisher.
     */
    @Override
    public int hashCode() {
        return Objects.hash(getPublisherId(), getName(), getAddress(), getPhoneNumber());
    }


    //toString method
    @Override
    public String toString() {
        return "Publisher{" +
                "publisherId='" + publisherId + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}

