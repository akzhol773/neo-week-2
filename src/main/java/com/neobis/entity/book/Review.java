package com.neobis.entity.book;


import com.neobis.entity.person.Customer;

import javax.persistence.*;
import java.util.Objects;
/**
 * Represents a review for a book.
 * Contains information about the review ID, rating, associated book, reviewer's comment, and the reviewer.
 */
@Entity
@Table(name = "review")
public class Review {
    // Unique identifier for the review
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    // Numeric rating given in the review
    private int rating;
    // The book that this review is associated with
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
    // Comment provided by the reviewer
    @Column(length = 1000)
    private String comment;
    // The customer who wrote the review

    //Customer who gives review
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer reviewer;



    /**
     * Constructor to initialize a Review object with all its attributes.
     *
     * @param id Unique identifier for the review.
     * @param rating Numeric rating given in the review.
     * @param book The book that this review is associated with.
     * @param comment Comment provided by the reviewer.
     * @param reviewer The customer who wrote the review.
     */
    public Review(Long id, int rating, Book book, String comment, Customer reviewer) {
        this.id = id;
        this.rating = rating;
        this.book = book;
        this.comment = comment;
        this.reviewer = reviewer;
    }
    public Review(){

    }

    // Getter and Setter methods for each field

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Customer getReviewer() {
        return reviewer;
    }

    public void setReviewer(Customer reviewer) {
        this.reviewer = reviewer;
    }


    // Override methods

    /**
     * Determines if this Review is equal to another object.
     * Two Reviews are considered equal if their IDs and other fields are equal.
     *
     * @param o The object to compare with this Review.
     * @return true if the objects are equal, false otherwise.
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Review review)) return false;
        return getRating() == review.getRating() && Objects.equals(getId(), review.getId()) && Objects.equals(getBook(), review.getBook()) && Objects.equals(getComment(), review.getComment()) && Objects.equals(getReviewer(), review.getReviewer());
    }



    /**
     * Generates a hash code for the Review.
     * This is used in collections like HashMap.
     *
     * @return A hash code value for the Review.
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getRating(), getBook(), getComment(), getReviewer());
    }


    // toString method

    @Override
    public String toString() {
        return "Review{" +
                "reviewID='" + id + '\'' +
                ", rating=" + rating +
                ", book=" + book +
                ", comment='" + comment + '\'' +
                ", reviewer=" + reviewer +
                '}';
    }
}
