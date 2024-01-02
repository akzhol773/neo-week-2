package org.example;

import java.util.Date;

/**
 * Represents a book in a library or bookstore system.
 * Contains information about the book's ID, title, author, ISBN, price, genre, publisher, publication date, and stock quantity.
 */
public class Book {
    // Unique identifier for the book
    private String bookID;
    // Title of the book
    private String title;
    // Author of the book
    private String author;
    // ISBN number of the book
    private String isbn;
    // Price of the book
    private double price;
    // Genre of the book
    private String genre;
    // Publisher of the book
    private String publisher;
    // Date when the book was published
    private Date publicationDate;
    // Quantity of the book available in stock
    private int stockQuantity;

    /**
     * Constructs a new Book with the specified details.
     *
     * @param bookID          Unique identifier for the book
     * @param title           Title of the book
     * @param author          Author of the book
     * @param isbn            ISBN number of the book
     * @param price           Price of the book
     * @param genre           Genre of the book
     * @param publisher       Publisher of the book
     * @param publicationDate Date when the book was published
     * @param stockQuantity   Quantity of the book available in stock
     */
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

    /**
     * Constructs a new Book with no details (default constructor).
     */
    public Book() {
    }

    // Getters and setters


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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
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

    /**
     * Returns a string representation of the Book object.
     * Includes all details like bookID, title, author, etc.
     *
     * @return A string representation of the Book object.
     */
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
