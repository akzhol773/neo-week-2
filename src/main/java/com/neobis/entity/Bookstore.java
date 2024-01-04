package com.neobis.entity;

import java.util.Objects;

/**
 * Represents a bookstore with basic information.
 * Stores details such as the bookstore ID, name, and address.
 */
public class Bookstore {
    // Unique identifier for the bookstore
    private String bookStoreID;
    // Name of the bookstore
    private String name;
    // Address of the bookstore
    private String address;

    /**
     * Constructs a new Bookstore with specified details.
     *
     * @param bookStoreID Unique identifier for the bookstore
     * @param name        Name of the bookstore
     * @param address     Address of the bookstore
     */
    public Bookstore(String bookStoreID, String name, String address) {
        this.bookStoreID = bookStoreID;
        this.name = name;
        this.address = address;
    }

    // Getters and setters for each field


    public String getBookStoreID() {
        return bookStoreID;
    }

    public void setBookStoreID(String bookStoreID) {
        this.bookStoreID = bookStoreID;
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



    /**
     * Returns a string representation of the Bookstore object.
     * Includes details like bookstore ID, name, and address.
     *
     * @return A string representation of the Bookstore object.
     */
    @Override
    public String toString() {
        return "Bookstore{" +
                "bookStoreID='" + bookStoreID + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bookstore bookstore)) return false;
        return Objects.equals(getBookStoreID(), bookstore.getBookStoreID()) && Objects.equals(getName(), bookstore.getName()) && Objects.equals(getAddress(), bookstore.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookStoreID(), getName(), getAddress());
    }
}
