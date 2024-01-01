package org.example;

import java.util.List;

public class Author  extends Person{
    private String authorID;
    private String biography;

    public Author(String firstName, String lastName, int contactNumber, String email, String authorID, String biography) {
        super(firstName, lastName, contactNumber, email);
        this.authorID = authorID;
        this.biography = biography;

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



    @Override
    public String toString() {
        return "Author{" +
                "authorID='" + authorID + '\'' +
                ", biography='" + biography + '\'' +
                "} " + super.toString();
    }
}
