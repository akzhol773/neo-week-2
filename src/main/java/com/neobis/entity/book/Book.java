package com.neobis.entity.book;
import javax.persistence.*;

import java.util.Date;
import java.util.Objects;

/**
 * Represents a book in a library or bookstore system.
 * Contains information about the book's ID, title, author, ISBN, price, genre, publisher, publication date, and stock quantity.
 */
@Entity
@Table(name = "book")
public class Book {
    // Unique identifier for the book
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    // Title of the book
    @Column(nullable = false, length = 100)
    private String title;

    // International Standard Book Number
    private String ISBN;


    // Author of the book
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;



    // Price of the book
    private double price;



    // Date when the book was published
    @Temporal(TemporalType.DATE)
    private Date publicationDate;



    // Quantity of the book available in stock
    private int stockQuantity;


    //Publisher
    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;


    // Gerne of the book
    @Enumerated(EnumType.STRING)
    private Genre genre;



    /**
     * Constructor to initialize a Book object with all its attributes.
     *
     * @param id The unique identifier for the book.
     * @param title The title of the book.
     * @param author The author of the book.
     * @param ISBN The International Standard Book Number.
     * @param price The price of the book.
     * @param genre The genre of the book.
     * @param publisher The publisher of the book.
     * @param publicationDate The date of publication.
     * @param stockQuantity The stock quantity of the book.
     */
    public Book(Long id, String title, String ISBN, Author author, double price, Date publicationDate, int stockQuantity, Publisher publisher, Genre genre) {
        this.id = id;
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.price = price;
        this.publicationDate = publicationDate;
        this.stockQuantity = stockQuantity;
        this.publisher = publisher;
        this.genre = genre;
    }




    public Book() {
    }

    // Getter and setter methods for each field


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    // Other methods (toString, equals, hashCode) as previously defined


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return Double.compare(getPrice(), book.getPrice()) == 0 && getStockQuantity() == book.getStockQuantity() && Objects.equals(getId(), book.getId()) && Objects.equals(getTitle(), book.getTitle()) && Objects.equals(getISBN(), book.getISBN()) && Objects.equals(getAuthor(), book.getAuthor()) && Objects.equals(getPublicationDate(), book.getPublicationDate()) && Objects.equals(getPublisher(), book.getPublisher()) && getGenre() == book.getGenre();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getISBN(), getAuthor(), getPrice(), getPublicationDate(), getStockQuantity(), getPublisher(), getGenre());
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookID='" + id + '\'' +
                ", title='" + title + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", author=" + author +
                ", price=" + price +
                ", publicationDate=" + publicationDate +
                ", stockQuantity=" + stockQuantity +
                ", publisher=" + publisher +
                ", genre=" + genre +
                '}';
    }
}
