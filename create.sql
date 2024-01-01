create database BookStore;
use BookStore;

# Creating Book table
CREATE TABLE book (
    book_id VARCHAR(25) PRIMARY KEY,
    author_id varchar(100) NOT NULL,
    title VARCHAR(55) NOT NULL,
    isbn VARCHAR(20) UNIQUE,
    price DECIMAL(10, 2),
    genre VARCHAR(100),
    publisher VARCHAR(25),
    publication_date DATE,
    stock_quantity INT NOT NULL,
    FOREIGN KEY (author_id) REFERENCES author(author_id)
);

# Author table
CREATE TABLE author (
    author_id VARCHAR(25) PRIMARY KEY,
    first_name VARCHAR(25) NOT NULL,
    last_name VARCHAR(25) NOT NULL,
    contact_number INT,
    email VARCHAR(25),
    biography TEXT
);

# Review table
CREATE TABLE review (
    review_id VARCHAR(25) PRIMARY KEY,
    book_id VARCHAR(25) NOT NULL,
    comment TEXT,
    rating INT,
    customer_id VARCHAR(25),
    FOREIGN KEY (book_id) REFERENCES book(book_id),
    FOREIGN KEY (customer_id) REFERENCES customer(customer_id)
);

# Customer table
CREATE TABLE customer (
    customer_id VARCHAR(25) PRIMARY KEY,
    first_name VARCHAR(25) NOT NULL,
    last_name VARCHAR(25) NOT NULL,
    contact_number INT,
    email VARCHAR(25)
);

# Employee table
CREATE TABLE employee (
    employee_id VARCHAR(25) PRIMARY KEY,
    first_name VARCHAR(25) NOT NULL,
    last_name VARCHAR(25) NOT NULL,
    bookstore_id VARCHAR(25),
    contact_number INT,
    email VARCHAR(25),
    role VARCHAR(25),
    FOREIGN KEY (bookstore_id) REFERENCES bookstore(bookstore_id)
);


# Event table
CREATE TABLE event (
    event_id VARCHAR(25) PRIMARY KEY,
    name VARCHAR(25) NOT NULL,
    event_date DATE
);


#Bookstore table
CREATE TABLE bookstore(
    bookstore_id VARCHAR(255) PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    address TEXT
);












