package org.example;

import java.util.List;

public class Bookstore {
    private String bookStoreID;
    private String name;
    private String address;
    private List<Book> booksAvailable;
    private List<Author> authors;
    private List<Employee> employees;
    private List<Event> events;

    public Bookstore(String bookStoreID, String name, String address, List<Book> booksAvailable, List<Author> authors, List<Employee> employees, List<Event> events) {
        this.bookStoreID = bookStoreID;
        this.name = name;
        this.address = address;
        this.booksAvailable = booksAvailable;
        this.authors = authors;
        this.employees = employees;
        this.events = events;
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

    public List<Book> getBooksAvailable() {
        return booksAvailable;
    }

    public void setBooksAvailable(List<Book> booksAvailable) {
        this.booksAvailable = booksAvailable;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    @Override
    public String toString() {
        return "Bookstore{" +
                "bookStoreID='" + bookStoreID + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", booksAvailable=" + booksAvailable +
                ", authors=" + authors +
                ", employees=" + employees +
                ", events=" + events +
                '}';
    }
}
