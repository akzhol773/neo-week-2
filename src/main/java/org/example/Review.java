package org.example;

public class Review {
    String reviewID;
    private int rating;
    private Book book;
    private String comment;
    private Customer reviewer;

    public Review(String reviewID, int rating, String comment, Customer reviewer, Book book) {
        this.reviewID = reviewID;
        this.rating = rating;
        this.comment = comment;
        this.reviewer = reviewer;
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

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
