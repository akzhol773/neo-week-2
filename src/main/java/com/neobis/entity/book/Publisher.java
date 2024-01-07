package com.neobis.entity.book;

import javax.persistence.*;
import java.util.Objects;

/**
 * Represents a publisher of books.
 * This class contains information about the publisher such as their ID, name, address, and phone number.
 */
@Entity
@Table(name = "publisher")
public class Publisher {

    // Fields of the Publisher class
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;  // Unique identifier for the publisher
    @Column(length = 200)
    private String name;         // Name of the publisher
    @Column(length = 500)
    private String address;      // Address of the publisher
    @Column(name = "phone_number")
    private int phoneNumber;     // Phone number of the publisher

    /**
     * Constructor to initialize a Publisher object with all its attributes.
     *
     * @param id Unique identifier for the publisher.
     * @param name Name of the publisher.
     * @param address Address of the publisher.
     * @param phoneNumber Phone number of the publisher.
     */
    public Publisher(Long id, String name, String address, int phoneNumber) {
        this.id = id;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

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
        return getPhoneNumber() == publisher.getPhoneNumber() && Objects.equals(getId(), publisher.getId()) && Objects.equals(getName(), publisher.getName()) && Objects.equals(getAddress(), publisher.getAddress());
    }



    /**
     * Generates a hash code for the Publisher.
     * This is used in collections like HashMap.
     *
     * @return A hash code value for the Publisher.
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAddress(), getPhoneNumber());
    }


    //toString method
    @Override
    public String toString() {
        return "Publisher{" +
                "publisherId='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}

