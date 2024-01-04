package com.neobis.entity;

import java.util.Date;
import java.util.Objects;

/**
 * Represents an event with a unique ID, name, and date.
 * This class can be used to manage and track different events.
 */
public class Event {
    // Unique identifier for the event
    private String eventID;
    // Name of the event
    private String name;
    // Date on which the event is scheduled to occur
    private Date date;

    /**
     * Constructs a new Event with specified details.
     *
     * @param eventID Unique identifier for the event
     * @param name    Name of the event
     * @param date    Date of the event
     */
    public Event(String eventID, String name, Date date) {
        this.eventID = eventID;
        this.name = name;
        this.date = date;
    }

    // Getters and setters for each field


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
    // ...

    /**
     * Returns a string representation of the Event object.
     * Includes details like event ID, name, and date.
     *
     * @return A string representation of the Event object.
     */
    @Override
    public String toString() {
        return "Event{" +
                "eventID='" + eventID + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event event)) return false;
        return Objects.equals(getEventID(), event.getEventID()) && Objects.equals(getName(), event.getName()) && Objects.equals(getDate(), event.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEventID(), getName(), getDate());
    }

}
