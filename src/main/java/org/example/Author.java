package org.example;

import java.util.List;

public class Author  extends Person{
    private String authorID;

    private String biography;
    private List<Book> booksWritten;
    private List<Event> events;

    public Author(String firstName, String lastName, int contactNumber, String email, String authorID, String biography, List<Book> booksWritten, List<Event> events) {
        super(firstName, lastName, contactNumber, email);
        this.authorID = authorID;
        this.biography = biography;
        this.booksWritten = booksWritten;
        this.events = events;
    }

    public String getAuthorID() {
        return authorID;
    }

    public void setAuthorID(String authorID) {
        this.authorID = authorID;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public List<Book> getBooksWritten() {
        return booksWritten;
    }

    public void setBooksWritten(List<Book> booksWritten) {
        this.booksWritten = booksWritten;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorID='" + authorID + '\'' +
                ", biography='" + biography + '\'' +
                ", booksWritten=" + booksWritten +
                ", events=" + events +
                "} " + super.toString();
    }
}
