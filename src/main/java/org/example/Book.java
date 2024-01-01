package org.example;

import java.util.Date;
import java.util.List;

public class Book {
    String bookID;
    private String title;
    private List<Author> authors;
    private String isbn;
    private double price;
    private String genre;
    private String publisher;
    private Date publicationDate;
    private int stockQuantity;
    private List<Review> reviews;

    public Book(String bookID, String title, List<Author> authors, String isbn, double price, String genre, String publisher, Date publicationDate, int stockQuantity, List<Review> reviews) {
        this.bookID = bookID;
        this.title = title;
        this.authors = authors;
        this.isbn = isbn;
        this.price = price;
        this.genre = genre;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
        this.stockQuantity = stockQuantity;
        this.reviews = reviews;
    }

    public Book() {
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookID='" + bookID + '\'' +
                ", title='" + title + '\'' +
                ", authors=" + authors +
                ", isbn='" + isbn + '\'' +
                ", price=" + price +
                ", genre='" + genre + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publicationDate=" + publicationDate +
                ", stockQuantity=" + stockQuantity +
                ", reviews=" + reviews +
                '}';
    }
}
