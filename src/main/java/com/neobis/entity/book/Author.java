package com.neobis.entity.book;
import javax.persistence.*;

import com.neobis.entity.person.Person;

import java.util.Objects;

/**
 * Represents an author, extending the Person class.
 * This class stores additional author-specific information such as author ID and biography.
 */

@Entity
@Table(name = "author")// Discriminator for SINGLE_TABLE inheritance
public class Author extends Person {
    // Biography of the author
    @Column(length = 1000) // Optional: Customize the column definition
    private String biography;

    /**
     * Constructor to initialize an Author object with author ID and biography.
     * This constructor is used when all author details are known.
     *
     * @param biography The biography of the author.
     */
    public Author(Long id, String firstName, String lastName, int contactNumber, String email, String biography) {
        super(id, firstName, lastName, contactNumber, email);
        this.biography = biography;
    }


    /**
     * Default constructor.
     * Creates an empty Author object. Useful when author details are set using setters.
     */
    public Author() {
    }

    // Getter and Setter methods


    /**
     * Gets the biography of the author.
     *
     * @return The biography of the author.
     */
    public String getBiography() {
        return biography;
    }

    /**
     * Sets the biography of the author.
     *
     * @param biography The new biography of the author.
     */
    public void setBiography(String biography) {
        this.biography = biography;
    }

    // Override methods from the Object class

    /**
     * Determines if this Author is equal to another object.
     * Two Authors are considered equal if their IDs and biographies are equal.
     *
     * @param o The object to compare with this Author.
     * @return true if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author author)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getBiography(), author.getBiography());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getBiography());
    }

    /**
     * Generates a hash code for the Author.
     * This is used in collections like HashMap.
     *
     * @return A hash code value for the Author.
     */



    // toString method
    @Override
    public String toString() {
        return "Author{" +
                ", biography='" + biography + '\'' +
                "} " + super.toString();
    }
}

