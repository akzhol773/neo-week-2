package com.neobis.dao;

import com.neobis.entity.book.Publisher;
import com.neobis.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PublisherDAO {

    // Create or update a publisher
    public void saveOrUpdatePublisher(Publisher publisher) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(publisher);
            transaction.commit();
        }
    }

    // Retrieve a publisher by ID
    public Publisher getPublisherById(Long publisherId) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Publisher.class, publisherId);
        }
    }

    // Retrieve all publishers
    public List<Publisher> getAllPublishers() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Publisher", Publisher.class).list();
        }
    }

    // Delete a publisher
    public void deletePublisher(Publisher publisher) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(publisher);
            transaction.commit();
        }
    }
}
