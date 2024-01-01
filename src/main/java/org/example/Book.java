package org.example;

import java.util.Date;
import java.util.List;

public class Book {
    private String bookID;
    private String title;
    private String author;
    private String isbn;
    private double price;
    private String genre;
    private String publisher;
    private Date publicationDate;
    private int stockQuantity;

    public Book(String bookID, String title, String author, String isbn, double price, String genre, String publisher, Date publicationDate, int stockQuantity) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.genre = genre;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
        this.stockQuantity = stockQuantity;

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

    public String getAuthors() {
        return author;
    }

    public void setAuthors(String author) {
        this.author = author;
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


    @Override
    public String toString() {
        return "Book{" +
                "bookID='" + bookID + '\'' +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", isbn='" + isbn + '\'' +
                ", price=" + price +
                ", genre='" + genre + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publicationDate=" + publicationDate +
                ", stockQuantity=" + stockQuantity +
                '}';
    }
}
