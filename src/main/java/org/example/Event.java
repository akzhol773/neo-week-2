package org.example;

import java.util.Date;
import java.util.List;

public class Event {
    private String eventID;
    private String name;
    private Date date;
    private List<Author> participatingAuthors;
    private List<Book> featuredBooks;

    public Event(String eventID, String name, Date date, List<Author> participatingAuthors, List<Book> featuredBooks) {
        this.eventID = eventID;
        this.name = name;
        this.date = date;
        this.participatingAuthors = participatingAuthors;
        this.featuredBooks = featuredBooks;
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Author> getParticipatingAuthors() {
        return participatingAuthors;
    }

    public void setParticipatingAuthors(List<Author> participatingAuthors) {
        this.participatingAuthors = participatingAuthors;
    }

    public List<Book> getFeaturedBooks() {
        return featuredBooks;
    }

    public void setFeaturedBooks(List<Book> featuredBooks) {
        this.featuredBooks = featuredBooks;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventID='" + eventID + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", participatingAuthors=" + participatingAuthors +
                ", featuredBooks=" + featuredBooks +
                '}';
    }
}
