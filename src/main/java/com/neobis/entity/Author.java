package com.neobis.entity;

import java.util.Objects;

/**
 * Represents an author, extending the Person class.
 * Stores additional author-specific information such as author ID and biography.
 */
public class Author extends Person {
    // Unique identifier for the author
    private String authorID;
    // Biography of the author
    private String biography;

    /**
     * Constructs a new Author with specified personal and author-specific details.
     *
     * @param firstName     The first name of the author (inherited from Person)
     * @param lastName      The last name of the author (inherited from Person)
     * @param contactNumber The contact number of the author (inherited from Person)
     * @param email         The email address of the author (inherited from Person)
     * @param authorID      The unique identifier for the author
     * @param biography     The biography of the author
     */
    public Author(String firstName, String lastName, int contactNumber, String email, String authorID, String biography) {
        super(firstName, lastName, contactNumber, email); // Call to the super class (Person) constructor
        this.authorID = authorID;
        this.biography = biography;
    }

    // Getters and setters for author-specific fields

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
    // ...

    /**
     * Returns a string representation of the Author object, including both personal and author-specific details.
     *
     * @return A string representation of the Author object.
     */
    @Override
    public String toString() {
        return "Author{" +
                "authorID='" + authorID + '\'' +
                ", biography='" + biography + '\'' +
                "} " + super.toString(); // Includes the toString output from the Person class
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author author)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getAuthorID(), author.getAuthorID()) && Objects.equals(getBiography(), author.getBiography());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getAuthorID(), getBiography());
    }
}
