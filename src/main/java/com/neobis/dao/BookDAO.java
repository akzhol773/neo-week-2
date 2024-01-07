package com.neobis.dao;

import com.neobis.entity.book.Book;
import com.neobis.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class BookDAO {

    // Create or update a book
    public void saveOrUpdateBook(Book book) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(book);
            transaction.commit();
        }
    }

    // Retrieve a book by ID
    public Book getBookById(Long bookID) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Book.class, bookID);
        }
    }

    // Retrieve all books
    public List<Book> getAllBooks() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Book", Book.class).list();
        }
    }

    // Delete a book
    public void deleteBook(Book book) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(book);
            transaction.commit();
        }
    }
}
