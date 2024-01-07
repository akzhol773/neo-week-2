package com.neobis.entity.book;

import com.neobis.entity.person.Person;

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


}
