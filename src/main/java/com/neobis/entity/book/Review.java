package com.neobis.entity.book;


import com.neobis.entity.person.Customer;
import java.util.Objects;
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
    private Customer reviewer;

    /**
     * Constructor to initialize a Review object with all its attributes.
     *
     * @param reviewID Unique identifier for the review.
     * @param rating Numeric rating given in the review.
     * @param book The book that this review is associated with.
     * @param comment Comment provided by the reviewer.
     * @param customer The customer who wrote the review.
     */
    public Review(String reviewID, int rating, Book book, String comment, Customer customer) {
        this.reviewID = reviewID;
        this.rating = rating;
        this.book = book;
        this.comment = comment;
        this.reviewer = customer;
    }
    public Review(){

    }

    // Getter and Setter methods for each field

    public String getReviewID() {
        return reviewID;
    }

    public void setReviewID(String reviewID) {
        this.reviewID = reviewID;
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
        return getRating() == review.getRating() && Objects.equals(getReviewID(), review.getReviewID()) && Objects.equals(getBook(), review.getBook()) && Objects.equals(getComment(), review.getComment()) && Objects.equals(getReviewer(), review.getReviewer());
    }

    /**
     * Generates a hash code for the Review.
     * This is used in collections like HashMap.
     *
     * @return A hash code value for the Review.
     */

    @Override
    public int hashCode() {
        return Objects.hash(getReviewID(), getRating(), getBook(), getComment(), getReviewer());
    }

    // toString method

    @Override
    public String toString() {
        return "Review{" +
                "reviewID='" + reviewID + '\'' +
                ", rating=" + rating +
                ", book=" + book +
                ", comment='" + comment + '\'' +
                ", reviewer=" + reviewer +
                '}';
    }
}
