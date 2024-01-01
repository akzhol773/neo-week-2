package org.example;

import java.util.Date;
import java.util.List;

public class Event {
    private String eventID;
    private String name;
    private Date date;


    public Event(String eventID, String name, Date date) {
        this.eventID = eventID;
        this.name = name;
        this.date = date;

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



    @Override
    public String toString() {
        return "Event{" +
                "eventID='" + eventID + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
