package com.neobis.entity.book;

import java.util.Date;
import java.util.Objects;

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
    private Author author;



    // Price of the book
    private double price;



    // Date when the book was published
    private Date publicationDate;



    // Quantity of the book available in stock
    private int stockQuantity;





}
