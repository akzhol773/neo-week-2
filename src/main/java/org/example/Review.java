package org.example;

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
    private Customer reviewer;

    /**
     * Constructs a new Review with specified details.
     *
     * @param reviewID  The unique identifier for the review
     * @param rating    The rating given in the review
     * @param comment   The comment provided by the reviewer
     * @param reviewer  The customer who wrote the review
     * @param book      The book that the review is associated with
     */
    public Review(String reviewID, int rating, String comment, Customer reviewer, Book book) {
        this.reviewID = reviewID;
        this.rating = rating;
        this.comment = comment;
        this.reviewer = reviewer;
        this.book = book;
    }

    // Getters and setters for each field
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

    /**
     * Returns a string representation of the Review object.
     * Includes details like review ID, rating, book details, comment, and reviewer details.
     *
     * @return A string representation of the Review object.
     */
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Review review)) return false;
        return getRating() == review.getRating() && Objects.equals(getReviewID(), review.getReviewID()) && Objects.equals(getBook(), review.getBook()) && Objects.equals(getComment(), review.getComment()) && Objects.equals(getReviewer(), review.getReviewer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getReviewID(), getRating(), getBook(), getComment(), getReviewer());
    }
}
