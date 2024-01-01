package org.example;

import java.util.List;

public class Bookstore {
    private String bookStoreID;
    private String name;
    private String address;


    public Bookstore(String bookStoreID, String name, String address) {
        this.bookStoreID = bookStoreID;
        this.name = name;
        this.address = address;

    }

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

    @Override
    public String toString() {
        return "Bookstore{" +
                "bookStoreID='" + bookStoreID + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
