package com.neobis.entity.book;


import com.neobis.entity.person.Customer;

/**
 * Represents a review for a book.
 * Contains information about the review ID, rating, associated book, reviewer's comment, and the reviewer.
 */
public class Review {
    // Unique identifier for the review
    String reviewID;
    // Numeric rating given in the review
    private int rating;
    // The book that this review is associated with
    private Book book;
    // Comment provided by the reviewer
    private String comment;
    // The customer who wrote the review

    //Customer who gives review
    private Customer customer;





}
