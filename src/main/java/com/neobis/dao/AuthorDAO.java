package com.neobis.dao;

import com.neobis.entity.book.Author;
import com.neobis.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class AuthorDAO {

    // Create or update an author
    public void saveOrUpdateAuthor(Author author) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(author);
            transaction.commit();
        }
    }

    // Retrieve an author by ID
    public Author getAuthorById(Long authorID) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Author.class, authorID);
        }
    }

    // Retrieve all authors
    public List<Author> getAllAuthors() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Author", Author.class).list();
        }
    }

    // Delete an author
    public void deleteAuthor(Author author) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(author);
            transaction.commit();
        }
    }
}

